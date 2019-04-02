package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019561 Coordination sequence for C_5 lattice.
 * @author Sean A. Irvine
 */
public class A019561 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019561() {
    super(
      new long[] {1, 45, 210, 210, 45, 1},
      new int[] {1, 1, 1, 1, 1});
  }
}

