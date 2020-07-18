package irvine.oeis.a033;

/**
 * A033758 Expansion of <code>Product_{d | 46} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033758 extends A033720 {

  @Override
  protected int base() {
    return 46;
  }
}
