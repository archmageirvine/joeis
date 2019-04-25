package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201838 G.f.: imaginary part of <code>1/(1 - i*x - i*x^2)</code> where <code>i=sqrt(-1)</code>.
 * @author Sean A. Irvine
 */
public class A201838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201838() {
    super(new long[] {-1, -2, -1, 0}, new long[] {0, 1, 1, -1});
  }
}
