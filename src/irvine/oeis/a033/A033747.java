package irvine.oeis.a033;

/**
 * A033747 Expansion of <code>Product_{d | 35} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033747 extends A033720 {

  @Override
  protected int base() {
    return 35;
  }
}
