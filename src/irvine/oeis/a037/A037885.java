package irvine.oeis.a037;

/**
 * A037885 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*8^i} is the base 8 representation of n and e(i) are the digits d(i) in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037885 extends A037879 {

  @Override
  protected int base() {
    return 8;
  }
}
