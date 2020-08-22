package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089947 G.f.: (1-x)^9/((1-5*x+6*x^2-4*x^3+x^4)*(-1+4*x-3*x^2+x^3)*(1-3*x+x^2)*(-1+2*x)).
 * @author Sean A. Irvine
 */
public class A089947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089947() {
    super(new long[] {-2, 21, -98, 270, -485, 588, -481, 254, -81, 14}, new long[] {1, 5, 25, 115, 500, 2092, 8512, 33910, 132892, 514079});
  }
}
