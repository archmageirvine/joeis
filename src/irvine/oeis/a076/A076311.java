package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076311 a(n) = floor(n/10) - 5*(n mod 10).
 * @author Sean A. Irvine
 */
public class A076311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076311() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, -5, -10, -15, -20, -25, -30, -35, -40, -45, 1});
  }
}
