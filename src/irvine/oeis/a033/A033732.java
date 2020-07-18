package irvine.oeis.a033;

/**
 * A033732 Expansion of <code>Product_{d | 20} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033732 extends A033720 {

  @Override
  protected int base() {
    return 20;
  }
}
