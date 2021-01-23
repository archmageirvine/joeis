package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162607 a(n) = n*(n^2 - 4*n + 5)/2.
 * @author Sean A. Irvine
 */
public class A162607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162607() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 1, 3});
  }
}
