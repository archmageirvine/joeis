package irvine.oeis.a028;

/**
 * A028711 Expansion of (theta_3(z)*theta_3(5z)*theta_3(25z)+theta_2(z)*theta_2(5z)*theta_2(25z))^2.
 * @author Sean A. Irvine
 */
public class A028711 extends A028710 {

  @Override
  protected int power() {
    return 2;
  }
}
