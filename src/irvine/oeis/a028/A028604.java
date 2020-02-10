package irvine.oeis.a028;

/**
 * A028604 Expansion of <code>(theta_3(z)*theta_3(9z)+theta_2(z)*theta_2(9z))^4</code>.
 * @author Sean A. Irvine
 */
public class A028604 extends A028601 {

  @Override
  protected int power() {
    return 4;
  }
}
