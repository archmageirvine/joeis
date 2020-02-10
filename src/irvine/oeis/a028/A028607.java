package irvine.oeis.a028;

/**
 * A028607 Expansion of <code>(theta_3(z)*theta_3(10z)+theta_2(z)*theta_2(10z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028607 extends A028605 {

  @Override
  protected int power() {
    return 3;
  }
}
