package irvine.oeis.a028;

/**
 * A028614 Expansion of (theta_3(z)*theta_3(12z)+theta_2(z)*theta_2(12z))^2.
 * @author Sean A. Irvine
 */
public class A028614 extends A028613 {

  @Override
  protected int power() {
    return 2;
  }
}
