package irvine.oeis.a037;

/**
 * A037893 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*7^i} is the base 7 representation of n and e(i) are the digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037893 extends A037888 {

  @Override
  protected int base() {
    return 7;
  }
}
