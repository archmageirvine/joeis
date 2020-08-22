package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117473 The values of 'a' in a^2 + b^2 = c^2, where b - a = 17 and gcd(a, b, c) = 1.
 * @author Sean A. Irvine
 */
public class A117473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117473() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {7, 28, 88, 207, 555});
  }
}
