package irvine.oeis.a037;

/**
 * A037841 a(n)=Sum{|d(i)-d(i-1)|: i=1,...,m}, where Sum{d(i)*9^i: i=0,1,...,m} is the base 9 representation of n.
 * @author Sean A. Irvine
 */
public class A037841 extends A037835 {

  @Override
  protected long base() {
    return 9;
  }
}
