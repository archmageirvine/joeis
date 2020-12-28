package irvine.oeis.a037;

/**
 * A037856 Sum{d(i)-d(i-1): d(i)&gt;d(i-1), i=1,...,m}, where Sum{d(i)*6^i: i=0,1,...,m} is base 6 representation of n.
 * @author Sean A. Irvine
 */
public class A037856 extends A037853 {

  @Override
  protected long base() {
    return 6;
  }
}
