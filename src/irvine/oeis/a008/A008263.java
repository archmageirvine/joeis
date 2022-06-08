package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008263 Coordination sequence T2 for Scapolite.
 * @author Sean A. Irvine
 */
public class A008263 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008263() {
    super(
      new long[] {1, 4, 11, 26, 41, 50, 67, 75, 59, 46, 17, -32, -67, -104, -129, -130, -129, -104, -67, -32, 17, 46, 59, 75, 67, 50, 41, 26, 11, 4, 1},
      new int[] {4, 4, 6, 7, 9});
  }
}

