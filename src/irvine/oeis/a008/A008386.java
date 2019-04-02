package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008386 Crystal ball sequence for A_5 lattice.
 * @author Sean A. Irvine
 */
public class A008386 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008386() {
    super(
      new long[] {1, 25, 100, 100, 25, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

