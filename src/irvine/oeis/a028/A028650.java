package irvine.oeis.a028;

/**
 * A028650 Expansion of (theta_3(z)*theta_3(21z)+theta_2(z)*theta_2(21z))^2.
 * @author Sean A. Irvine
 */
public class A028650 extends A028649 {

  @Override
  protected int power() {
    return 2;
  }
}
