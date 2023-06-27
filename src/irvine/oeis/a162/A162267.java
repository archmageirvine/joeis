package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162267 a(n) = (2*n^3 + 5*n^2 + 5*n)/2.
 * @author Sean A. Irvine
 */
public class A162267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162267() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {6, 23, 57, 114});
  }
}
