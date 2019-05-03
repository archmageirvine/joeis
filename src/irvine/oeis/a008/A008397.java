package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008397 Coordination sequence for <code>E_7</code> lattice.
 * @author Sean A. Irvine
 */
public class A008397 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008397() {
    super(
      new long[] {1, 119, 2037, 8211, 8787, 2037, 119, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

