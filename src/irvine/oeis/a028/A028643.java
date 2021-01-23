package irvine.oeis.a028;

/**
 * A028643 Expansion of (theta_3(z)*theta_3(19z) + theta_2(z)*theta_2(19z))^3.
 * @author Sean A. Irvine
 */
public class A028643 extends A028641 {

  @Override
  protected int power() {
    return 3;
  }
}
