package irvine.oeis.a028;

/**
 * A028627 Expansion of (theta_3(z)*theta_3(15z) + theta_2(z)*theta_2(15z))^3.
 * @author Sean A. Irvine
 */
public class A028627 extends A028625 {

  @Override
  protected int power() {
    return 3;
  }
}
