package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278438 Numbers m such that T(m) + 2*T(m+1) is a square, where T = A000217.
 * @author Sean A. Irvine
 */
public class A278438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278438() {
    super(new long[] {1, -99, 99}, new long[] {7, 799, 78407});
  }
}
