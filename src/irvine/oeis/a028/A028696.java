package irvine.oeis.a028;

import irvine.oeis.a008.A008665;

/**
 * A028696 Expansion of <code>(theta_3(z)*theta_3(z)*theta_3(z)+theta_2(z)*theta_2(z)*theta_2(z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028696 extends A008665 {

  @Override
  protected int power() {
    return 3;
  }
}
