package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064429 <code>a(n) = floor(n / 3) * 3 +</code> sign(n <code>mod 3) * (3 - n mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A064429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064429() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 1, 3});
  }
}
