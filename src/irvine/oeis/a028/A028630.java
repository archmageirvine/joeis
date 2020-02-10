package irvine.oeis.a028;

/**
 * A028630 Expansion of <code>(theta_3(z)*theta_3(16z)+theta_2(z)*theta_2(16z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028630 extends A028629 {

  @Override
  protected int power() {
    return 2;
  }
}
