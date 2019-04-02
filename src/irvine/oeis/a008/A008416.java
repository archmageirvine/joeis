package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008416 Coordination sequence for 8-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008416 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008416() {
    super(
      new long[] {1, 8, 28, 56, 70, 56, 28, 8, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

