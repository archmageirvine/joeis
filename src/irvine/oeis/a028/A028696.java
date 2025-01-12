package irvine.oeis.a028;

import irvine.oeis.a008.A008665;

/**
 * A028696 Expansion of (theta_3(z^4)^3  + theta_2(z^4)^3)^3.
 * @author Sean A. Irvine
 */
public class A028696 extends A008665 {

  @Override
  protected int power() {
    return 3;
  }
}
