package irvine.oeis.a033;

/**
 * A033754 Expansion of <code>Product_{d | 42} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033754 extends A033720 {

  @Override
  protected int base() {
    return 42;
  }
}
