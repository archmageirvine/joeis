package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008532 Coordination sequence for 4-dimensional I-centered cubic orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A008532 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008532() {
    super(
      new long[] {1, 6, 10, 6, 1},
      new int[] {1, 1, 1, 1});
  }
}

