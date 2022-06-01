package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178633 a(n) = 54*( (10^n - 1)/9 )^2.
 * @author Sean A. Irvine
 */
public class A178633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178633() {
    super(new long[] {1000, -1110, 111}, new long[] {54, 6534, 665334});
  }
}
