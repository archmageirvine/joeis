package irvine.oeis.a028;

/**
 * A028610 Expansion of (theta_3(z)*theta_3(11z) + theta_2(z)*theta_2(11z))^2.
 * @author Sean A. Irvine
 */
public class A028610 extends A028609 {

  @Override
  protected int power() {
    return 2;
  }
}
