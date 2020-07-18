package irvine.oeis.a033;

/**
 * A033748 Expansion of <code>Product_{d | 36} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033748 extends A033720 {

  @Override
  protected int base() {
    return 36;
  }
}
