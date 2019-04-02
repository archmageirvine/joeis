package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008413 Coordination sequence for 5-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008413 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008413() {
    super(
      new long[] {1, 5, 10, 10, 5, 1},
      new int[] {1, 1, 1, 1, 1});
  }
}

