package irvine.oeis.a033;

/**
 * A033736 Expansion of <code>Product_{d | 24} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033736 extends A033720 {

  @Override
  protected int base() {
    return 24;
  }
}
