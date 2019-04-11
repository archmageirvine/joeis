package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059633 G.f.: <code>x^3/(1 - 2*x + x^3 - x^4).</code> Recurrence: <code>a(n) = 2*a(n-1) - a(n-3) + a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A059633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059633() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 2, 4, 7});
  }
}
