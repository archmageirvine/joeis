package irvine.oeis.a028;

/**
 * A028705 Expansion of (theta_3(z)*theta_3(3z)*theta_3(9z)+theta_2(z)*theta_2(3z)*theta_2(9z))^4.
 * @author Sean A. Irvine
 */
public class A028705 extends A028702 {

  @Override
  protected int power() {
    return 4;
  }
}
