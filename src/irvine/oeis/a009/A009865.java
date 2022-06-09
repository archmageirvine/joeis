package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009865 Coordination sequence T2 for Zeolite Code AFX.
 * @author Sean A. Irvine
 */
public class A009865 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009865() {
    super(
      new long[] {1, 4, 9, 17, 28, 40, 51, 59, 64, 68, 73, 78, 78, 73, 68, 64, 59, 51, 40, 28, 17, 9, 4, 1},
      new int[] {4, 5, 14});
  }
}

