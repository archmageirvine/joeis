package irvine.oeis.a033;

/**
 * A033772 Product t2(q^d); d | 13, where t2 = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033772 extends A033763 {

  @Override
  protected int base() {
    return 13;
  }
}
