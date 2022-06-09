package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008000 Coordination sequence T1 for Zeolite Code ABW and ATN.
 * @author Sean A. Irvine
 */
public class A008000 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008000() {
    super(
      new long[] {1, 3, 6, 9, 9, 6, 3, 1},
      new int[] {1, 3, 3});
  }
}

