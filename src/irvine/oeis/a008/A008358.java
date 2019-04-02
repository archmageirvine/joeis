package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008358 Crystal ball sequence for D_6 lattice.
 * @author Sean A. Irvine
 */
public class A008358 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008358() {
    super(
      new long[] {1, 54, 447, 852, 447, 54, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

