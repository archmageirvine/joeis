package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008349 Crystal ball sequence for E_8 lattice.
 * @author Sean A. Irvine
 */
public class A008349 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008349() {
    super(
      new long[] {1, 232, 7228, 55384, 133510, 107224, 24508, 232, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
