package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245487 Number of compositions of n into parts 3,4 where both parts are always present.
 * @author Georg Fischer
 */
public class A245487 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245487() {
    super(0, new long[] {0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 1},
      new long[] {1, 1, 1, -1, -3, -3, -2, 1, 2, 2, 1});
  }
}
