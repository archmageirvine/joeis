package irvine.oeis.a033;

/**
 * A033733 Expansion of <code>Product_{d | 21} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033733 extends A033720 {

  @Override
  protected int base() {
    return 21;
  }
}
