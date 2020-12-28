package irvine.oeis.a037;

/**
 * A037858 Sum{d(i)-d(i-1): d(i)&gt;d(i-1), i=1,...,m}, where Sum{d(i)*8^i: i=0,1,...,m} is base 8 representation of n.
 * @author Sean A. Irvine
 */
public class A037858 extends A037853 {

  @Override
  protected long base() {
    return 8;
  }
}
