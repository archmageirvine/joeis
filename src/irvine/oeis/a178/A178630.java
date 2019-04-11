package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178630 <code>a(n) = 18 * ((10^n - 1)/9)^2</code>.
 * @author Sean A. Irvine
 */
public class A178630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178630() {
    super(new long[] {1000, -1110, 111}, new long[] {18, 2178, 221778});
  }
}
