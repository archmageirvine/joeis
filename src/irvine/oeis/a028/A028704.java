package irvine.oeis.a028;

/**
 * A028704 Expansion of <code>(theta_3(z)*theta_3(3z)*theta_3(9z)+theta_2(z)*theta_2(3z)*theta_2(9z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028704 extends A028702 {

  @Override
  protected int power() {
    return 3;
  }
}
