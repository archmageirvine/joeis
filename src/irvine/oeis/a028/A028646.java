package irvine.oeis.a028;

/**
 * A028646 Expansion of <code>(theta_3(z)*theta_3(20z)+theta_2(z)*theta_2(20z))^2</code>.
 * @author Sean A. Irvine
 */
public class A028646 extends A028645 {

  @Override
  protected int power() {
    return 2;
  }
}
