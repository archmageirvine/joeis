package irvine.oeis.a037;

/**
 * A037907 Number of i such that |d(i) - d(i-1)| = 1, where Sum_{i=0..m} d(i)*4^i is the base-4 representation of n.
 * @author Sean A. Irvine
 */
public class A037907 extends A037906 {

  @Override
  protected long base() {
    return 4;
  }
}
