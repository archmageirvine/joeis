package irvine.oeis.a037;

/**
 * A037895 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*9^i} is the base 9 representation of n and e(i) are the digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037895 extends A037888 {

  @Override
  protected int base() {
    return 9;
  }
}
