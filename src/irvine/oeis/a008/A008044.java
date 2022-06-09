package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008044 Coordination sequence T2 for Zeolite Code ATV.
 * @author Sean A. Irvine
 */
public class A008044 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008044() {
    super(
      new long[] {1, 3, 8, 13, 17, 19, 27, 34, 37, 37, 37, 37, 34, 27, 19, 17, 13, 8, 3, 1},
      new int[] {1, 8, 10});
  }
}

