package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008421 Crystal ball sequence for 10-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008421 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008421() {
    super(
      new long[] {1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

