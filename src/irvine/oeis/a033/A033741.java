package irvine.oeis.a033;

/**
 * A033741 Expansion of <code>Product_{d | 29} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033741 extends A033720 {

  @Override
  protected int base() {
    return 29;
  }
}
