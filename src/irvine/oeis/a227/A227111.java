package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227111 Nonnegative solutions of the Pell equation x^2 - 89*y^2 = +1. Solutions y = 53000*a(n).
 * @author Sean A. Irvine
 */
public class A227111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227111() {
    super(new long[] {-1, 1000002}, new long[] {0, 1});
  }
}
