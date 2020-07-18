package irvine.oeis.a033;

/**
 * A033738 Expansion of <code>Product_{d | 26} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033738 extends A033720 {

  @Override
  protected int base() {
    return 26;
  }
}
