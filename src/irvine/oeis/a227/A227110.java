package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227110 Nonnegative solutions of the Pell equation x^2 - 89*y^2 = +1. Solutions x = a(n).
 * @author Sean A. Irvine
 */
public class A227110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227110() {
    super(new long[] {-1, 1000002}, new long[] {1, 500001});
  }
}
