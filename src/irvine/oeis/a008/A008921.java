package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008921 Coordination sequence for lattice <code>{E_7}*</code>.
 * @author Sean A. Irvine
 */
public class A008921 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008921() {
    super(
      new long[] {1, 49, 567, 2263, 3703, 2583, 625, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

