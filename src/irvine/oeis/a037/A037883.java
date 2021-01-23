package irvine.oeis.a037;

/**
 * A037883 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*6^i) is the base 6 representation of n and e(i) are the digits d(i) in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037883 extends A037879 {

  @Override
  protected int base() {
    return 6;
  }
}
