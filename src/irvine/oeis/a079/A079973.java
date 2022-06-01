package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079973 Number of permutations satisfying -k &lt;= p(i) - i &lt;= r and p(i) - i not in I, i=1..n, with k=1, r=4, I={0,3}.
 * @author Sean A. Irvine
 */
public class A079973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079973() {
    super(new long[] {1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1});
  }
}
