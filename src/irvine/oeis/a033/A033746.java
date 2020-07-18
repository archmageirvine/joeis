package irvine.oeis.a033;

/**
 * A033746 Expansion of <code>Product_{d | 34} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033746 extends A033720 {

  @Override
  protected int base() {
    return 34;
  }
}
