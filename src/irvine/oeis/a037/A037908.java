package irvine.oeis.a037;

/**
 * A037908 Number of i such that |d(i) - d(i-1)| = 1, where Sum_{i=0..m} d(i)*5^i is the base-5 representation of n.
 * @author Sean A. Irvine
 */
public class A037908 extends A037906 {

  @Override
  protected long base() {
    return 5;
  }
}
