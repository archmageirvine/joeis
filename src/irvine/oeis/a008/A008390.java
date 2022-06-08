package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008390 Crystal ball sequence for A_7 lattice.
 * @author Sean A. Irvine
 */
public class A008390 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008390() {
    super(
      new long[] {1, 49, 441, 1225, 1225, 441, 49, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

