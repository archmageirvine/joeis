package irvine.oeis.a033;

/**
 * A033759 Expansion of <code>Product_{d | 47} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033759 extends A033720 {

  @Override
  protected int base() {
    return 47;
  }
}
