package irvine.oeis.a028;

/**
 * A028659 Expansion of (theta_3(z)*theta_3(23z) + theta_2(z)*theta_2(23z))^3.
 * @author Sean A. Irvine
 */
public class A028659 extends A028658 {

  @Override
  protected int power() {
    return 3;
  }
}
