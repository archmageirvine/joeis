package irvine.oeis.a033;

/**
 * A033742 Expansion of <code>Product_{d | 30} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033742 extends A033720 {

  @Override
  protected int base() {
    return 30;
  }
}
