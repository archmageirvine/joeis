package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008383 Coordination sequence for A_4 lattice.
 * @author Sean A. Irvine
 */
public class A008383 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008383() {
    super(
      new long[] {1, 16, 36, 16, 1},
      new int[] {1, 1, 1, 1});
  }
}

