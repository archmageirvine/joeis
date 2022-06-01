package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178630 a(n) = 18 * ((10^n - 1)/9)^2.
 * @author Sean A. Irvine
 */
public class A178630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178630() {
    super(new long[] {1000, -1110, 111}, new long[] {18, 2178, 221778});
  }
}
