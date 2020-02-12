package irvine.oeis.a028;

/**
 * A028708 Expansion of <code>(theta_3(z)*theta_3(4z)*theta_3(16z)+theta_2(z)*theta_2(4z)*theta_2(16z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028708 extends A028706 {

  @Override
  protected int power() {
    return 3;
  }
}
