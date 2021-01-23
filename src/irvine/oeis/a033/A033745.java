package irvine.oeis.a033;

/**
 * A033745 Expansion of Product_{d | 33} theta_3(q^d).
 * @author Sean A. Irvine
 */
public class A033745 extends A033720 {

  @Override
  protected int base() {
    return 33;
  }
}
