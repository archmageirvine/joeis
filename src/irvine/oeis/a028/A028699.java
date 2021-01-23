package irvine.oeis.a028;

/**
 * A028699 Expansion of (theta_3(z)*theta_3(2z)*theta_3(4z)+theta_2(z)*theta_2(2z)*theta_2(4z))^2.
 * @author Sean A. Irvine
 */
public class A028699 extends A028698 {

  @Override
  protected int power() {
    return 2;
  }
}
