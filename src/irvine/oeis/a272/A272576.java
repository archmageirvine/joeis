package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272576 <code>a(n) = f(10, f(9, n))</code>, where <code>f(k</code>,m) = floor(m*k/(k-1)).
 * @author Sean A. Irvine
 */
public class A272576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272576() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 10});
  }
}
