package irvine.oeis.a179;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179041 Partial sums of ceiling(Fibonacci(n)/3).
 * @author Georg Fischer
 */
public class A179041 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179041() {
    super(0, new long[] {0, -1, 0, 1, 1, 0, 0, 0, 1, 1},
      new long[] {-1, 2, 0, -1, 0, 0, 0, 0, 1, -2, 0, 1});
  }
}
