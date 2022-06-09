package irvine.oeis.a038;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A038401 Coordination sequence T3 for Zeolite Code AFN.
 * @author Sean A. Irvine
 */
public class A038401 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038401() {
    super(
      new long[] {1, 4, 9, 17, 30, 49, 73, 94, 106, 119, 132, 128, 100, 64, 41, 12, -41, -88, -102, -108, -132, -139, -108, -78, -71, -61, -30, -5, -5, -8, -1, 4, 0, -4, -2},
      new int[] {6, 6, 8, 10});
  }
}
