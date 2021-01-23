package irvine.oeis.a028;

/**
 * A028611 Expansion of (theta_3(z)*theta_3(11z) + theta_2(z)*theta_2(11z))^3.
 * @author Sean A. Irvine
 */
public class A028611 extends A028609 {

  @Override
  protected int power() {
    return 3;
  }
}
