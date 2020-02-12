package irvine.oeis.a028;

/**
 * A028721 Expansion of <code>(theta_3(z)*theta_3(7z)*theta_3(49z)+theta_2(z)*theta_2(7z)*theta_2(49z))^4</code>.
 * @author Sean A. Irvine
 */
public class A028721 extends A028718 {

  @Override
  protected int power() {
    return 4;
  }
}
