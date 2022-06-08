package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009954 Coordination sequence for FeS2-Marcasite, S position.
 * @author Sean A. Irvine
 */
public class A009954 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009954() {
    super(
      new long[] {1, 4, 16, 29, 41, 35, 27, -17, -35, -54, -30, -15, -3, 3, -1, -1},
      new int[] {2, 3, 4, 4});
  }
}
