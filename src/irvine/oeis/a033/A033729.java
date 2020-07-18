package irvine.oeis.a033;

/**
 * A033729 Expansion of <code>Product_{d | 17} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033729 extends A033720 {

  @Override
  protected int base() {
    return 17;
  }
}
