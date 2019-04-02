package irvine.oeis.a016;

import irvine.oeis.CoordinationSequence;

/**
 * A016432 Coordination sequence T3 for Zeolite Code OSI.
 * @author Sean A. Irvine
 */
public class A016432 extends CoordinationSequence {

  /** Construct the sequence. */
  public A016432() {
    super(
      new long[] {1, 4, 12, 21, 32, 44, 46, 50, 48, 38, 15, -10, -29, -45, -45, -55, -52, -41, -27, -14, -7, 5, 5, 7, 3, -1, -2, -3},
      new int[] {3, 4, 6, 8});
  }
}
