package irvine.oeis.a033;

/**
 * A033757 Expansion of <code>Product_{d | 45} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033757 extends A033720 {

  @Override
  protected int base() {
    return 45;
  }
}
