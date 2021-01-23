package irvine.oeis.a028;

/**
 * A028578 Expansion of (theta_3(z)*theta_3(2z)+theta_2(z)*theta_2(2z))^3.
 * @author Sean A. Irvine
 */
public class A028578 extends A028577 {

  @Override
  protected int power() {
    return 3;
  }
}
