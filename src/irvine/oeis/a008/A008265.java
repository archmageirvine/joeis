package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008265 Coordination sequence T1 for Zeolite Code ATO.
 * @author Sean A. Irvine
 */
public class A008265 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008265() {
    super(
      new long[] {1, 3, 7, 11, 15, 20, 20, 15, 11, 7, 3, 1},
      new int[] {1, 5, 5});
  }
}

