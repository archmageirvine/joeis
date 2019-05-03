package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008376 Coordination sequence for <code>D_9</code> lattice.
 * @author Sean A. Irvine
 */
public class A008376 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008376() {
    super(
      new long[] {1, 135, 2934, 18186, 43128, 43128, 18186, 2934, 135, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
