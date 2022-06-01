package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162262 a(n) = (2*n^3 + 5*n^2 - 13*n)/2.
 * @author Sean A. Irvine
 */
public class A162262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162262() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-3, 5, 30, 78});
  }
}
