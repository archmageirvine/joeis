package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079273 Octo numbers (a polygonal sequence): a(n) = 5*n^2 - 6*n + 2 = (n-1)^2 + (2*n-1)^2.
 * @author Sean A. Irvine
 */
public class A079273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079273() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 10, 29});
  }
}
