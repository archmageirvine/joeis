package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008043 Coordination sequence T1 for Zeolite Code ATV.
 * @author Sean A. Irvine
 */
public class A008043 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008043() {
    super(
      new long[] {1, 3, 7, 11, 18, 24, 28, 29, 35, 40, 40, 35, 29, 28, 24, 18, 11, 7, 3, 1},
      new int[] {1, 8, 10});
  }
}

