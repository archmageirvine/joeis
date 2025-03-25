package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054469 a(n) = a(n-1) + a(n-2) + (n+2)*binomial(n+3, 3)/2, with a(0) = 1, a(1) = 7.
 * @author Sean A. Irvine
 */
public class A054469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054469() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {1, 7, 28, 85, 218, 499, 1053});
  }
}
