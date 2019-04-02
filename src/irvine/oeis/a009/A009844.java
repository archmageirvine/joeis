package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009844 Coordination sequence T1 for Keatite.
 * @author Sean A. Irvine
 */
public class A009844 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009844() {
    super(
      new long[] {1, 4, 12, 26, 48, 75, 109, 136, 167, 174, 181, 163, 136, 97, 33, -15, -83, -116, -169, -175, -186, -161, -154, -117, -85, -56, -32, -16, 0, 1, 4, -2, 2, -2},
      new int[] {5, 6, 8, 10});
  }
}
