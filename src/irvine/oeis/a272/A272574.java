package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272574 a(n) = f(9, f(8, n)), where f(k,m) = floor(m*k/(k-1)).
 * @author Sean A. Irvine
 */
public class A272574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272574() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 9});
  }
}
