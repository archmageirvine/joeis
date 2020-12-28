package irvine.oeis.a037;

/**
 * A037840 a(n)=Sum{|d(i)-d(i-1)|: i=1,...,m}, where Sum{d(i)*8^i: i=0,1,...,m} is the base 8 representation of n.
 * @author Sean A. Irvine
 */
public class A037840 extends A037835 {

  @Override
  protected long base() {
    return 8;
  }
}
