package irvine.oeis.a033;

/**
 * A033755 Expansion of Product_{d | 43} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033755 extends A033720 {

  @Override
  protected int base() {
    return 43;
  }
}
