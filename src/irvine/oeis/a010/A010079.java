package irvine.oeis.a010;

import irvine.oeis.CoordinationSequence;

/**
 * A010079 Coordination sequence for net formed by holes in <code>D_4</code> lattice.
 * @author Sean A. Irvine
 */
public class A010079 extends CoordinationSequence {

  /** Construct the sequence. */
  public A010079() {
    super(
      new long[] {1, 14, 71, 124, 63, -2, 25, -8},
      new int[] {1, 1, 2, 2});
  }
}

