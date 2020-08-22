package irvine.oeis.a028;

/**
 * A028602 Expansion of (theta_3(z)*theta_3(9z)+theta_2(z)*theta_2(9z))^2.
 * @author Sean A. Irvine
 */
public class A028602 extends A028601 {

  @Override
  protected int power() {
    return 2;
  }
}
