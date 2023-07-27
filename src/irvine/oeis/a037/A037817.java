package irvine.oeis.a037;

/**
 * A037817 Number of i such that d(i) &lt;= d(i-1), where Sum_{i=0..m} d(i)*10^i is the base-10 representation of n.
 * @author Sean A. Irvine
 */
public class A037817 extends A037809 {

  @Override
  protected long base() {
    return 10;
  }
}
