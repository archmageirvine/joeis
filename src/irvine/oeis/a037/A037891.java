package irvine.oeis.a037;

/**
 * A037891 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*5^i} is the base 5 representation of n and e(i) are the digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037891 extends A037888 {

  @Override
  protected int base() {
    return 5;
  }
}
