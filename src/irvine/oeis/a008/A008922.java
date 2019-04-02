package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008922 Crystal ball sequence for lattice {E_7}*.
 * @author Sean A. Irvine
 */
public class A008922 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008922() {
    super(
      new long[] {1, 49, 567, 2263, 3703, 2583, 625, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

