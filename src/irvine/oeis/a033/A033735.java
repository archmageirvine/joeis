package irvine.oeis.a033;

/**
 * A033735 Expansion of Product_{d | 23} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033735 extends A033720 {

  @Override
  protected int base() {
    return 23;
  }
}
