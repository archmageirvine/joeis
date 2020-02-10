package irvine.oeis.a028;

/**
 * A028628 Expansion of <code>(theta_3(z)*theta_3(15z)+theta_2(z)*theta_2(15z))^4</code>.
 * @author Sean A. Irvine
 */
public class A028628 extends A028625 {

  @Override
  protected int power() {
    return 4;
  }
}
