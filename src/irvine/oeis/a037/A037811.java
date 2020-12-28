package irvine.oeis.a037;

/**
 * A037811 Number of i such that d(i)&lt;=d(i-1), where Sum{d(i)*4^i: i=0,1,...,m} is the base 4 representation of n.
 * @author Sean A. Irvine
 */
public class A037811 extends A037809 {

  @Override
  protected long base() {
    return 4;
  }
}
