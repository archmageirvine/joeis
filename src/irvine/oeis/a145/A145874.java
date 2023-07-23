package irvine.oeis.a145;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.a147.A147681;

/**
 * A145874 Number of permutations of the numbers 1, 2, ..., n such that for all 1 &lt;= k &lt;= n the average of the first k numbers is at least the average of all n numbers.
 * @author Georg Fischer
 */
public class A145874 extends A147681 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A145874() {
    skip(1);
  }
}
