package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162256 a(n) = (2*n^3 + 5*n^2 - 3*n)/2.
 * @author Sean A. Irvine
 */
public class A162256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162256() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 15, 45, 98});
  }
}
