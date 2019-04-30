package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086689 <code>a(n) = Sum_{i=1..n} i^2*t(i)</code>, where t = A000217.
 * @author Sean A. Irvine
 */
public class A086689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086689() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 13, 67, 227, 602, 1358});
  }
}
