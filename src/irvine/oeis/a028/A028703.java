package irvine.oeis.a028;

/**
 * A028703 Expansion of <code>(theta_3(z)*theta_3(3z)*theta_3(9z)+theta_2(z)*theta_2(3z)*theta_2(9z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028703 extends A028702 {

  @Override
  protected int power() {
    return 2;
  }
}
