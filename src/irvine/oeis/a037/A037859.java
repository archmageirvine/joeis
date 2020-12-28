package irvine.oeis.a037;

/**
 * A037859 Sum{d(i)-d(i-1): d(i)&gt;d(i-1), i=1,...,m}, where Sum{d(i)*9^i: i=0,1,...,m} is base 9 representation of n.
 * @author Sean A. Irvine
 */
public class A037859 extends A037853 {

  @Override
  protected long base() {
    return 9;
  }
}
