package irvine.oeis.a333;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1+3*x-x^3)/((1+x)*(1+x-x^2)*(1-x-x^2))
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A333599 a(n) = Fibonacci(n) * Fibonacci(n+1) mod Fibonacci(n+2).
 * @author Georg Fischer
 */
public class A333599 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A333599() {
    super(0, "[0,1,3,0,-1]", "[1,1,-3,-3,1,1]");
  }
}
