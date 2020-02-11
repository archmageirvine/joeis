package irvine.oeis.a028;

/**
 * A028642 Expansion of <code>(theta_3(z)*theta_3(19z)+theta_2(z)*theta_2(19z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028642 extends A028641 {

  @Override
  protected int power() {
    return 2;
  }
}
