package irvine.oeis.a028;

/**
 * A028615 Expansion of (theta_3(z)*theta_3(12z)+theta_2(z)*theta_2(12z))^3.
 * @author Sean A. Irvine
 */
public class A028615 extends A028613 {

  @Override
  protected int power() {
    return 3;
  }
}
