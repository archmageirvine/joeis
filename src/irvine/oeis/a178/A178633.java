package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178633 <code>a(n) = 54*( (10^n - 1)/9 )^2</code>.
 * @author Sean A. Irvine
 */
public class A178633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178633() {
    super(new long[] {1000, -1110, 111}, new long[] {54, 6534, 665334});
  }
}
