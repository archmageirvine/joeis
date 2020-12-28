package irvine.oeis.a037;

/**
 * A037890 a(n)=(1/2)*Sum{|d(i)-e(i)|} where Sum{d(i)*4^i} is the base 4 representation of n and e(i) are the digits d(i) in reverse order.
 * @author Sean A. Irvine
 */
public class A037890 extends A037888 {

  @Override
  protected int base() {
    return 4;
  }
}
