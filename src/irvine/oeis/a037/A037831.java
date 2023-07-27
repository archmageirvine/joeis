package irvine.oeis.a037;

/**
 * A037831 Number of i such that d(i) &gt;= d(i-1), where Sum_{i=0..m} d(i)*8^i is the base-8 representation of n.
 * @author Sean A. Irvine
 */
public class A037831 extends A037826 {

  @Override
  protected long base() {
    return 8;
  }
}
