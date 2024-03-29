package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208545 Number of 7-bead necklaces of n colors allowing reversal, with no adjacent beads having the same color.
 * @author Georg Fischer
 */
public class A208545 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A208545() {
    super(1, new long[] {0, 0, 0, 9, 84, 174, 84, 9},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
