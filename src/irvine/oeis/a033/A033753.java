package irvine.oeis.a033;

/**
 * A033753 Expansion of <code>Product_{d | 41} theta_3(q^d)</code>.
 * @author Sean A. Irvine
 */
public class A033753 extends A033720 {

  @Override
  protected int base() {
    return 41;
  }
}
