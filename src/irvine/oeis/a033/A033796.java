package irvine.oeis.a033;

/**
 * A033796 Product t2(q^d); d | 37, where t2 = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033796 extends A033763 {

  @Override
  protected int base() {
    return 37;
  }
}
