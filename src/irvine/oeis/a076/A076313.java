package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076313 a(n) = floor(n/10) - (n mod 10).
 * @author Sean A. Irvine
 */
public class A076313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076313() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, -1, -2, -3, -4, -5, -6, -7, -8, -9, 1});
  }
}
