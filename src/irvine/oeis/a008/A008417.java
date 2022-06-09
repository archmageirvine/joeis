package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008417 Crystal ball sequence for 8-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008417 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008417() {
    super(
      new long[] {1, 8, 28, 56, 70, 56, 28, 8, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

