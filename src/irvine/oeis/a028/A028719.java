package irvine.oeis.a028;

/**
 * A028719 Expansion of (theta_3(z)*theta_3(7z)*theta_3(49z)+theta_2(z)*theta_2(7z)*theta_2(49z))^2.
 * @author Sean A. Irvine
 */
public class A028719 extends A028718 {

  @Override
  protected int power() {
    return 2;
  }
}
