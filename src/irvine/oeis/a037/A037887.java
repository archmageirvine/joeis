package irvine.oeis.a037;

/**
 * A037887 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*10^i) is the base 10 representation of n and e(i) are the digits d(i) in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A037887 extends A037879 {

  @Override
  protected int base() {
    return 10;
  }
}
