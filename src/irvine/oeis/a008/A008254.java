package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008254 Coordination sequence T1 for feldspar.
 * @author Sean A. Irvine
 */
public class A008254 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008254() {
    super(
      new long[] {1, 3, 6, 8, 12, 8, 3, -1, -2, 2},
      new int[] {1, 3, 3});
  }
}

