package irvine.oeis.a028;

/**
 * A028591 Expansion of (theta_3(z)*theta_3(6z)+theta_2(z)*theta_2(6z))^2.
 * @author Sean A. Irvine
 */
public class A028591 extends A028590 {

  @Override
  protected int power() {
    return 2;
  }
}
