package irvine.oeis.a028;

/**
 * A028720 Expansion of <code>(theta_3(z)*theta_3(7z)*theta_3(49z)+theta_2(z)*theta_2(7z)*theta_2(49z))^3</code>.
 * @author Sean A. Irvine
 */
public class A028720 extends A028718 {

  @Override
  protected int power() {
    return 3;
  }
}
