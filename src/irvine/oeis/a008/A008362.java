package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008362 Crystal ball sequence for D_8 lattice.
 * @author Sean A. Irvine
 */
public class A008362 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008362() {
    super(
      new long[] {1, 104, 1724, 7768, 12550, 7768, 1724, 104, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
