package irvine.oeis.a028;

import irvine.oeis.a008.A008665;

/**
 * A028697 Expansion of (theta_3(z)*theta_3(z)*theta_3(z)+theta_2(z)*theta_2(z)*theta_2(z))^4.
 * @author Sean A. Irvine
 */
public class A028697 extends A008665 {

  @Override
  protected int power() {
    return 4;
  }
}
