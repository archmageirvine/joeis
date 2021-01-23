package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178631 a(n) = 27 * ((10^n - 1)/9)^2.
 * @author Sean A. Irvine
 */
public class A178631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178631() {
    super(new long[] {1000, -1110, 111}, new long[] {27, 3267, 332667});
  }
}
