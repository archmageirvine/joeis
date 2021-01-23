package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008126 Coordination sequence T3 for Zeolite Code LAU.
 * @author Sean A. Irvine
 */
public class A008126 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008126() {
    super(
      new long[] {1, 4, 10, 19, 32, 48, 60, 66, 71, 70, 55, 34, 12, -12, -34, -55, -70, -71, -66, -60, -48, -32, -19, -10, -4, -1},
      new int[] {4, 5, 7, 9});
  }
}
