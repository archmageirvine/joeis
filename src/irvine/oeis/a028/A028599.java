package irvine.oeis.a028;

/**
 * A028599 Expansion of <code>(theta_3(z)*theta_3(8z)+theta_2(z)*theta_2(8z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028599 extends A028597 {

  @Override
  protected int power() {
    return 3;
  }
}
