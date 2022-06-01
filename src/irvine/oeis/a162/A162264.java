package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162264 a(n) = (2*n^3 + 5*n^2 + 7*n)/2.
 * @author Sean A. Irvine
 */
public class A162264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162264() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 25, 60, 118});
  }
}
