package irvine.oeis.a037;

/**
 * A037808 Number of i such that d(i) &lt; d(i-1), where Sum_{i=0..m} d(i)*10^i is the base-10 representation of n.
 * @author Sean A. Irvine
 */
public class A037808 extends A037801 {

  @Override
  protected long base() {
    return 10;
  }
}
