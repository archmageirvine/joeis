package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008127.
 * @author Sean A. Irvine
 */
public class A008127 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008127() {
    super(
      new long[] {1, 4, 9, 17, 30, 47, 62, 69, 67, 57, 39, 14, -14, -39, -57, -67, -69, -62, -47, -30, -17, -9, -4, -1},
      new int[] {5, 5, 6, 7});
  }
}
