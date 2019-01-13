package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008227.
 * @author Sean A. Irvine
 */
public class A008227 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008227() {
    super(
      new long[] {1, 4, 9, 17, 27, 36, 40, 36, 27, 18, 10, 0, -10, -18, -27, -36, -40, -36, -27, -17, -9, -4, -1},
      new int[] {3, 4, 5, 10});
  }
}
