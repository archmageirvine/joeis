package irvine.oeis.a033;

/**
 * A033751 Expansion of <code>Product_{d | 39} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033751 extends A033720 {

  @Override
  protected int base() {
    return 39;
  }
}
