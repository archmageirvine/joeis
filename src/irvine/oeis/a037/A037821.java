package irvine.oeis.a037;

/**
 * A037821 Number of i such that d(i)&gt;d(i-1), where Sum{d(i)*6^i: i=0,1,....,m} is base 6 representation of n.
 * @author Sean A. Irvine
 */
public class A037821 extends A037818 {

  @Override
  protected long base() {
    return 6;
  }
}
