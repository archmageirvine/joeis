package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201967 Expansion of <code>1/(1-2*x-3*x^2+x^4)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A201967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201967() {
    super(new long[] {-1, 0, 3, 2}, new long[] {1, 2, 7, 20});
  }
}
