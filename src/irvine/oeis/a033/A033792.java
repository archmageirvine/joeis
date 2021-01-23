package irvine.oeis.a033;

/**
 * A033792 Product t2(q^d); d | 33, where t2(q) = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033792 extends A033763 {

  @Override
  protected int base() {
    return 33;
  }
}
