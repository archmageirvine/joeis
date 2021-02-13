package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227168 a(n) = gcd(2*n, n*(n+1)/2)^2.
 * @author Sean A. Irvine
 */
public class A227168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227168() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 1, 36, 4, 25, 9, 196, 16, 81, 25, 484, 36});
  }
}
