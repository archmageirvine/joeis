package irvine.oeis.a033;

/**
 * A033739 Expansion of Product_{d | 27} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033739 extends A033720 {

  @Override
  protected int base() {
    return 27;
  }
}
