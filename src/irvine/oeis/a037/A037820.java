package irvine.oeis.a037;

/**
 * A037820 Number of i such that d(i) &gt; d(i-1), where Sum_{i=0..m} d(i)*5^i is the base-5 representation of n.
 * @author Sean A. Irvine
 */
public class A037820 extends A037818 {

  @Override
  protected long base() {
    return 5;
  }
}
