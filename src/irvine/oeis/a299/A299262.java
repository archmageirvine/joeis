package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A299262 Partial sums of A299256.
 * @author Georg Fischer
 */
public class A299262 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299262() {
    super(0, new long[] {1, 4, 6, 6, 3, -2},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
