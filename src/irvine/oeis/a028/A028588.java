package irvine.oeis.a028;

/**
 * A028588 Expansion of (theta_3(z)*theta_3(5z)+theta_2(z)*theta_2(5z))^3.
 * @author Sean A. Irvine
 */
public class A028588 extends A028586 {

  @Override
  protected int power() {
    return 3;
  }
}
