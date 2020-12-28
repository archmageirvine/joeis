package irvine.oeis.a037;

/**
 * A037889 (1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*3^i} is base 3 representation of n and e(i) are digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037889 extends A037888 {

  @Override
  protected int base() {
    return 3;
  }
}
