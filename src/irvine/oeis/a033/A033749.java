package irvine.oeis.a033;

/**
 * A033749 Expansion of Product_{d | 37} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033749 extends A033720 {

  @Override
  protected int base() {
    return 37;
  }
}
