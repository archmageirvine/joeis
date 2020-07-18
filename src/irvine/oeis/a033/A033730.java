package irvine.oeis.a033;

/**
 * A033730 Expansion of <code>Product_{d | 18} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033730 extends A033720 {

  @Override
  protected int base() {
    return 18;
  }
}
