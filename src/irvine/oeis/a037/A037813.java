package irvine.oeis.a037;

/**
 * A037813 Number of i such that d(i)&lt;=d(i-1), where Sum{d(i)*6^i: i=0,1,...,m} is the base 6 representation of n.
 * @author Sean A. Irvine
 */
public class A037813 extends A037809 {

  @Override
  protected long base() {
    return 6;
  }
}
