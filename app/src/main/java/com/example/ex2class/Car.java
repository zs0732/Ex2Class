package com.example.ex2class;

public class Car  extends Vehicle{
    @Override
    public void start() {
        System.out.println("the car started driving");
    }
    public void stop() {
        System.out.println("the car stopped driving");
    }
    public void accelerate(){
        System.out.println("the car sped up");
    }
}
