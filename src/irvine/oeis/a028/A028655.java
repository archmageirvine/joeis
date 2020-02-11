package irvine.oeis.a028;

/**
 * A028655 Expansion of <code>(theta_3(z)*theta_3(22z)+theta_2(z)*theta_2(22z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028655 extends A028653 {

  @Override
  protected int power() {
    return 3;
  }
}
