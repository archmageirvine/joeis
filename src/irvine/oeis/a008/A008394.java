package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008394 Crystal ball sequence for A_9 lattice.
 * @author Sean A. Irvine
 */
public class A008394 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008394() {
    super(
      new long[] {1, 81, 1296, 7056, 15876, 15876, 7056, 1296, 81, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

