package irvine.oeis.a033;

/**
 * A033781 Product t2(q^d); d | 22, where t2 = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033781 extends A033763 {

  @Override
  protected int base() {
    return 22;
  }
}
