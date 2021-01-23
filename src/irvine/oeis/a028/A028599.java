package irvine.oeis.a028;

/**
 * A028599 Expansion of (theta_3(z)*theta_3(8z)+theta_2(z)*theta_2(8z))^3.
 * @author Sean A. Irvine
 */
public class A028599 extends A028597 {

  @Override
  protected int power() {
    return 3;
  }
}
