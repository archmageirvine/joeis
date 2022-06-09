package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009867 Coordination sequence T2 for Zeolite Code AHT.
 * @author Sean A. Irvine
 */
public class A009867 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009867() {
    super(
      new long[] {1, 3, 6, 8, 14, 21, 25, 27, 33, 33, 27, 26, 26, 18, 6, 3, 4, 2, -3, -2, 0, 1, 1},
      new int[] {1, 8, 8});
  }
}

