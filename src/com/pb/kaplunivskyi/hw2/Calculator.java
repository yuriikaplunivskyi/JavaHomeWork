package com.pb.kaplunivskyi.hw2;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1 ;
        int operand2;

        System.out.print("Введите первое число");
        operand1  = scan.nextInt();

        System.out.print("Введите второе число");
        operand2 = scan.nextInt();

        System.out.print("Что делаем(+-*/)?");

        String sign = scan.next(); // + - * /

        switch(sign) {
            case "+":
                System.out.println(+(operand1 + operand2));
                break;

            case "-":
                System.out.println(+(operand1  - operand2));
                break;

            case "*":
                System.out.println(+(operand1  * operand2));
                break;

            case "/":
                if (operand2 == 0)
                    System.out.println("Ошибочка у тебя вышла");
                else
                    System.out.println(+(operand1 / operand2));
                break;

            default: {
                System.out.println("Неверная операция");
            }


        }


    }
}