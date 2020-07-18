package irvine.oeis.a033;

/**
 * A033743 Expansion of <code>Product_{d | 31} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033743 extends A033720 {

  @Override
  protected int base() {
    return 31;
  }
}
