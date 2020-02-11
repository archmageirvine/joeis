package irvine.oeis.a028;

/**
 * A028647 Expansion of <code>(theta_3(z)*theta_3(20z)+theta_2(z)*theta_2(20z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028647 extends A028645 {

  @Override
  protected int power() {
    return 3;
  }
}
