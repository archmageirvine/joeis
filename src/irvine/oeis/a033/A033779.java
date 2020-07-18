package irvine.oeis.a033;

/**
 * A033779 Product <code>t2(q^d); d | 20</code>, where <code>t2 = theta2(q)/(2*q^(1/4))</code>.
 * @author Sean A. Irvine
 */
public class A033779 extends A033763 {

  @Override
  protected int base() {
    return 20;
  }
}
