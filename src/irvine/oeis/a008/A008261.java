package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008261 Coordination sequence for quartz.
 * @author Sean A. Irvine
 */
public class A008261 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008261() {
    super(
      new long[] {1, 3, 7, 14, 11, 3, -1, -2, 2},
      new int[] {1, 2, 3});
  }
}

