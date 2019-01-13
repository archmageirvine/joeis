package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008240.
 * @author Sean A. Irvine
 */
public class A008240 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008240() {
    super(
      new long[] {1, 3, 4, 9, 13, 12, 8, 16, 13, 9, 8, 3, -3, -4, 4},
      new int[] {1, 3, 8});
  }
}
