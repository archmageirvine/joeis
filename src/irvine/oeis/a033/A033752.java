package irvine.oeis.a033;

/**
 * A033752 Expansion of <code>Product_{d | 40} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033752 extends A033720 {

  @Override
  protected int base() {
    return 40;
  }
}
