package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272357 a(n) = n*(105*n^3 - 210*n^2 + 147*n - 34).
 * @author Sean A. Irvine
 */
public class A272357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272357() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 520, 4056, 15656});
  }
}
