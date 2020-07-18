package irvine.oeis.a033;

/**
 * A033722 Expansion of <code>Product_{d | 10} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033722 extends A033720 {

  @Override
  protected int base() {
    return 10;
  }
}
