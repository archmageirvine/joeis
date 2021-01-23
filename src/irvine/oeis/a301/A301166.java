package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301166 Coordination sequence T1 for Zeolite Code RWY.
 * @author Sean A. Irvine
 */
public class A301166 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301166() {
    super(
      new long[] {1, 4, 6, 12, 16, 24, 30, 32, 35, 32, 34, 24, 16, 12, 6, 4},
      new int[] {4, 6, 6});
  }
}

