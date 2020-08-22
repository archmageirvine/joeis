package irvine.oeis.a033;

/**
 * A033783 Product t2(q^d); d | 24, where t2 = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033783 extends A033763 {

  @Override
  protected int base() {
    return 24;
  }
}
