package irvine.oeis.a033;

/**
 * A033744 Expansion of Product_{d | 32} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033744 extends A033720 {

  @Override
  protected int base() {
    return 32;
  }
}
