package irvine.oeis.a028;

/**
 * A028700 Expansion of <code>(theta_3(z)*theta_3(2z)*theta_3(4z)+theta_2(z)*theta_2(2z)*theta_2(4z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028700 extends A028698 {

  @Override
  protected int power() {
    return 3;
  }
}
