package irvine.oeis.a037;

/**
 * A037913 Number of i such that |d(i) - d(i-1)| = 1, where Sum_{i=0..m} d(i)*10^i is the base-10 representation of n.
 * @author Sean A. Irvine
 */
public class A037913 extends A037906 {

  @Override
  protected long base() {
    return 10;
  }
}
