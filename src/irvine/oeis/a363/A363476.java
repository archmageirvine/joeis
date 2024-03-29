package irvine.oeis.a363;
// Generated by gen_seq4.pl ogf/lingf at 2023-06-30 07:57

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A363476 a(n) = Fibonacci(n)^2 * Fibonacci(n+1)^3.
 * @author Georg Fischer
 */
public class A363476 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A363476() {
    super(0, "[0,1,0,4,1]", "[1,-8,-40,60,40,-8,-1]");
  }
}
