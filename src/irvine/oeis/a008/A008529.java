package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008529 Coordination sequence for 4-dimensional face-centered cubic orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A008529 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008529() {
    super(
      new long[] {1, 10, 18, 10, 1},
      new int[] {1, 1, 1, 1});
  }
}

