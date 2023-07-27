package irvine.oeis.a037;

/**
 * A037813 Number of i such that d(i) &lt;= d(i-1), where Sum_{i=0..n} d(i)*6^i is the base-6 representation of n.
 * @author Sean A. Irvine
 */
public class A037813 extends A037809 {

  @Override
  protected long base() {
    return 6;
  }
}
