package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117473 The values of 'a' in <code>a^2 + b^2 =</code> c^2, where <code>b - a = 17</code> and <code>gcd(a, b</code>, c) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A117473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117473() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {7, 28, 88, 207, 555});
  }
}
