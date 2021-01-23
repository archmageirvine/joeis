package irvine.oeis.a028;

/**
 * A028638 Expansion of (theta_3(z)*theta_3(18z)+theta_2(z)*theta_2(18z))^2.
 * @author Sean A. Irvine
 */
public class A028638 extends A028637 {

  @Override
  protected int power() {
    return 2;
  }
}
