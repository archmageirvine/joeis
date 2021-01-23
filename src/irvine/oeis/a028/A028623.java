package irvine.oeis.a028;

/**
 * A028623 Expansion of (theta_3(z)*theta_3(14z)+theta_2(z)*theta_2(14z))^3.
 * @author Sean A. Irvine
 */
public class A028623 extends A028621 {

  @Override
  protected int power() {
    return 3;
  }
}
