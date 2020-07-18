package irvine.oeis.a033;

/**
 * A033731 Expansion of <code>Product_{d | 19} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033731 extends A033720 {

  @Override
  protected int base() {
    return 19;
  }
}
