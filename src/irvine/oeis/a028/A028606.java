package irvine.oeis.a028;

/**
 * A028606 Expansion of (theta_3(z)*theta_3(10z)+theta_2(z)*theta_2(10z))^2.
 * @author Sean A. Irvine
 */
public class A028606 extends A028605 {

  @Override
  protected int power() {
    return 2;
  }
}
