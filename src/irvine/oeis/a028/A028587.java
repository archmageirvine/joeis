package irvine.oeis.a028;

/**
 * A028587 Expansion of <code>(theta_3(z)*theta_3(5z)+theta_2(z)*theta_2(5z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028587 extends A028586 {

  @Override
  protected int power() {
    return 2;
  }
}
