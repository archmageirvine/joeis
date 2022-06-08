package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009864 Coordination sequence T3 for Zeolite Code -WEN.
 * @author Sean A. Irvine
 */
public class A009864 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009864() {
    super(
      new long[] {1, 3, 9, 20, 33, 44, 48, 53, 63, 78, 90, 83, 64, 52, 40, 13, -17, -38, -50, -66, -85, -90, -76, -61, -55, -48, -40, -33, -22, -9, -3, 1, 0, -2},
      new int[] {3, 7, 10, 11});
  }
}

