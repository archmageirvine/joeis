package irvine.oeis.a037;

/**
 * A037807 Number of i such that d(i) &lt; d(i-1), where Sum_{i=0..m} d(i)*9^i is the base-9 representation of n.
 * @author Sean A. Irvine
 */
public class A037807 extends A037801 {

  @Override
  protected long base() {
    return 9;
  }
}
