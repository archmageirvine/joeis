package irvine.oeis.a033;

/**
 * A033740 Expansion of <code>Product_{d | 28} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033740 extends A033720 {

  @Override
  protected int base() {
    return 28;
  }
}
