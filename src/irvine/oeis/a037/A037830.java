package irvine.oeis.a037;

/**
 * A037830 Number of i such that d(i)&gt;=d(i-1), where Sum{d(i)*7^i: i=0,1,...,m} is base 7 representation of n.
 * @author Sean A. Irvine
 */
public class A037830 extends A037826 {

  @Override
  protected long base() {
    return 7;
  }
}
