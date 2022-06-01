package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162257 a(n) = (2*n^3 + 5*n^2 - 11*n)/2.
 * @author Sean A. Irvine
 */
public class A162257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162257() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, 7, 33, 82});
  }
}
