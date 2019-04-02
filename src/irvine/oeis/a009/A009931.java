package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009931 Coordination sequence for MgCu2, Mg position.
 * @author Sean A. Irvine
 */
public class A009931 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009931() {
    super(
      new long[] {1, 16, 50, 95, 92, -30, -239, -316, -197, 81, 288, 295, 118, -36, -105, -80, -32, -1},
      new int[] {2, 2, 3, 3, 3, 4});
  }
}
