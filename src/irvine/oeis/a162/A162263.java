package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162263 a(n) = (2*n^3 + 5*n^2 + 11*n)/2.
 * @author Sean A. Irvine
 */
public class A162263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162263() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {9, 29, 66, 126});
  }
}
