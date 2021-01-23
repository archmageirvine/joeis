package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009890 Coordination sequence T1 for Zeolite Code RTE.
 * @author Sean A. Irvine
 */
public class A009890 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009890() {
    super(
      new long[] {1, 4, 10, 18, 28, 41, 48, 43, 29, 10, -8, -26, -43, -49, -43, -33, -21, -9, -1, 3, 1, -2, -1},
      new int[] {3, 4, 5, 7});
  }
}

