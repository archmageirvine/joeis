package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162259 a(n) = (2*n^3 + 5*n^2 - 17*n)/2.
 * @author Sean A. Irvine
 */
public class A162259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162259() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {-5, 1, 24, 70});
  }
}
