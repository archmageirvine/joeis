package irvine.oeis.a028;

/**
 * A028716 Expansion of <code>(theta_3(z)*theta_3(6z)*theta_3(36z)+theta_2(z)*theta_2(6z)*theta_2(36z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028716 extends A028714 {

  @Override
  protected int power() {
    return 3;
  }
}
