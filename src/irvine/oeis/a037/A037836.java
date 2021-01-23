package irvine.oeis.a037;

/**
 * A037836 a(n) = Sum{|d(i)-d(i-1)|: i=1,...,m}, where Sum{d(i)*4^i: i=0,1,...,m} is the base 4 representation of n.
 * @author Sean A. Irvine
 */
public class A037836 extends A037835 {

  @Override
  protected long base() {
    return 4;
  }
}
