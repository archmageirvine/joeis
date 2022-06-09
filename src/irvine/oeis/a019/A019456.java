package irvine.oeis.a019;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A019456 Coordination sequence T1 for Zeolite Code CZP.
 * @author Sean A. Irvine
 */
public class A019456 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019456() {
    super(
      new long[] {1, 4, 9, 18, 31, 50, 74, 95, 116, 133, 141, 146, 153, 140, 120, 111, 78, 47, 37, 23, 1, -1, 1, -8, 0, 6, 4, 5, 6, 1, -2, -2, -2},
      new int[] {4, 8, 10});
  }
}
