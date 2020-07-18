package irvine.oeis.a033;

/**
 * A033737 Expansion of <code>Product_{d | 25} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033737 extends A033720 {

  @Override
  protected int base() {
    return 25;
  }
}
