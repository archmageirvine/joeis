package irvine.oeis.a028;

/**
 * A028611 Expansion of <code>(theta_3(z)*theta_3(11z)+theta_2(z)*theta_2(11z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028611 extends A028609 {

  @Override
  protected int power() {
    return 3;
  }
}
