package irvine.oeis.a028;

/**
 * A028709 Expansion of <code>(theta_3(z)*theta_3(4z)*theta_3(16z)+theta_2(z)*theta_2(4z)*theta_2(16z))^4</code>.
 * @author Sean A. Irvine
 */
public class A028709 extends A028706 {

  @Override
  protected int power() {
    return 4;
  }
}
