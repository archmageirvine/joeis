package irvine.oeis.a028;

/**
 * A028651 Expansion of (theta_3(z)*theta_3(21z)+theta_2(z)*theta_2(21z))^3.
 * @author Sean A. Irvine
 */
public class A028651 extends A028649 {

  @Override
  protected int power() {
    return 3;
  }
}
