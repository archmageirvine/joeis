package irvine.oeis.a033;

/**
 * A033750 Expansion of <code>Product_{d | 38} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033750 extends A033720 {

  @Override
  protected int base() {
    return 38;
  }
}
