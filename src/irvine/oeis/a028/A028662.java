package irvine.oeis.a028;

/**
 * A028662 Expansion of <code>(theta_3(z)*theta_3(24z)+theta_2(z)*theta_2(24z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028662 extends A028661 {

  @Override
  protected int power() {
    return 2;
  }
}
