package irvine.oeis.a033;

/**
 * A033786 Product t2(q^d); d | 27, where t2 = theta2(q)/(2*q^(1/4)).
 * @author Sean A. Irvine
 */
public class A033786 extends A033763 {

  @Override
  protected int base() {
    return 27;
  }
}
