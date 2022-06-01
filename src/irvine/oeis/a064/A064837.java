package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064837 a(n) = (6*n^4 + 30*n^3 - 20*n^2 + 14)*n/30 + (n mod 2).
 * @author Sean A. Irvine
 */
public class A064837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064837() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {0, 2, 18, 114, 420, 1170, 2710});
  }
}
