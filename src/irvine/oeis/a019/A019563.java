package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019563 Coordination sequence for <code>C_7</code> lattice.
 * @author Sean A. Irvine
 */
public class A019563 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019563() {
    super(
      new long[] {1, 91, 1001, 3003, 3003, 1001, 91, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

