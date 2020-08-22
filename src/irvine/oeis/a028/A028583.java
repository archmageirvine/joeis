package irvine.oeis.a028;

/**
 * A028583 Expansion of (theta_3(z)*theta_3(4z)+theta_2(z)*theta_2(4z))^2.
 * @author Sean A. Irvine
 */
public class A028583 extends A028573 {

  @Override
  protected int power() {
    return 2;
  }
}
