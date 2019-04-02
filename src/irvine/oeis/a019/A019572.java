package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019572 Coordination sequence T2 for Zeolite Code SAO.
 * @author Sean A. Irvine
 */
public class A019572 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019572() {
    super(
      new long[] {1, 4, 9, 16, 22, 27, 35, 42, 43, 40, 37, 33, 26, 16, 0, -16, -26, -33, -37, -40, -43, -42, -35, -27, -22, -16, -9, -4, -1},
      new int[] {3, 4, 10, 11});
  }
}
