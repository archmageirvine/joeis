package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008414 Coordination sequence for 6-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008414 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008414() {
    super(
      new long[] {1, 6, 15, 20, 15, 6, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

