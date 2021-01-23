package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008262 Coordination sequence T1 for Scapolite.
 * @author Sean A. Irvine
 */
public class A008262 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008262() {
    super(
      new long[] {1, 4, 11, 20, 38, 60, 70, 75, 63, 42, 17, -30, -70, -102, -134, -140, -128, -102, -66, -30, 17, 48, 63, 75, 68, 56, 40, 20, 9, 2, -1, 2, 2},
      new int[] {4, 4, 6, 7, 9});
  }
}

