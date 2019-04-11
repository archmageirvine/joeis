package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173234 Expansion of <code>x*(1+3*x^2-2*x^3+2*x^4-x^5)/((1+x)*(x-1)^2*(x^2+1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A173234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173234() {
    super(new long[] {-1, 1, -1, 1, 1, -1, 1}, new long[] {0, 1, 1, 3, 1, 2, 3});
  }
}
