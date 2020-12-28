package irvine.oeis.a037;

/**
 * A037881 (1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*4^i) is base 4 representation of n and e(i) are digits d(i) in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037881 extends A037879 {

  @Override
  protected int base() {
    return 4;
  }
}
