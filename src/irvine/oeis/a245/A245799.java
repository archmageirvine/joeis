package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245799 Lucas(3*n) - Fibonacci(n).
 * @author Georg Fischer
 */
public class A245799 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245799() {
    super(0, new long[] {2, -7, 6, 5},
      new long[] {1, -5, 2, 5, 1});
  }
}
