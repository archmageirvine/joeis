package irvine.oeis.a028;

/**
 * A028715 Expansion of (theta_3(z)*theta_3(6z)*theta_3(36z)+theta_2(z)*theta_2(6z)*theta_2(36z))^2.
 * @author Sean A. Irvine
 */
public class A028715 extends A028714 {

  @Override
  protected int power() {
    return 2;
  }
}
