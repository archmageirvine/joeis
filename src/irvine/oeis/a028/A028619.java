package irvine.oeis.a028;

/**
 * A028619 Expansion of (theta_3(z)*theta_3(13z)+theta_2(z)*theta_2(13z))^3.
 * @author Sean A. Irvine
 */
public class A028619 extends A028617 {

  @Override
  protected int power() {
    return 3;
  }
}
