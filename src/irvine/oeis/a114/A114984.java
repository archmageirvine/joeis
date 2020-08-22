package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114984 Coefficients of cubic equations in the form w^2=4*x^3-g2*x-g3 Weierstrass elliptic form whose solutions approximate zeta zeros.
 * @author Sean A. Irvine
 */
public class A114984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114984() {
    super(new long[] {-1, 1, 1}, new long[] {200, 199, 442});
  }
}
