package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054473 Number of ways of numbering the faces of a cube with nonnegative integers so that the sum of the 6 numbers is n.
 * @author Georg Fischer
 */
public class A054473 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054473() {
    super(0, new long[] {1, 0, 0, 0, 1, 1, 3},
      new long[] {1, -1, -2, 0, 2, 4, -1, -3, -3, -1, 4, 2, 0, -2, -1, 1});
  }
}
