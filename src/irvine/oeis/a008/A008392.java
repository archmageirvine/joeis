package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008392 Crystal ball sequence for <code>A_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A008392 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008392() {
    super(
      new long[] {1, 64, 784, 3136, 4900, 3136, 784, 64, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

