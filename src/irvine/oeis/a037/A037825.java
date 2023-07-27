package irvine.oeis.a037;

/**
 * A037825 Number of i such that d(i) &gt; d(i-1), where Sum_{i=0..m} d(i)*10^i is the base-10 representation of n.
 * @author Sean A. Irvine
 */
public class A037825 extends A037818 {

  @Override
  protected long base() {
    return 10;
  }
}
