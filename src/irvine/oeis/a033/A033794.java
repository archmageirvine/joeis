package irvine.oeis.a033;

/**
 * A033794 Product <code>t2(q^d); d | 35</code>, where <code>t2 = theta2(q)/(2*q^(1/4))</code>.
 * @author Sean A. Irvine
 */
public class A033794 extends A033763 {

  @Override
  protected int base() {
    return 35;
  }
}
