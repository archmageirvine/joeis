package irvine.oeis.a028;

/**
 * A028631 Expansion of <code>(theta_3(z)*theta_3(16z)+theta_2(z)*theta_2(16z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028631 extends A028629 {

  @Override
  protected int power() {
    return 3;
  }
}
