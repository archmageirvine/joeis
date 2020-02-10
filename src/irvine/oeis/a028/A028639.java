package irvine.oeis.a028;

/**
 * A028639 Expansion of <code>(theta_3(z)*theta_3(18z)+theta_2(z)*theta_2(18z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028639 extends A028637 {

  @Override
  protected int power() {
    return 3;
  }
}
