package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215415 a(2*n) = n, a(4*n+1) = 2*n-1, a(4*n+3) = 2*n+3.
 * @author Sean A. Irvine
 */
public class A215415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215415() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, -1, 1, 3});
  }
}
