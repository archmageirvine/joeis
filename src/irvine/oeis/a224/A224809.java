package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224809 Number of permutations (p(1), p(2), ..., p(n)) satisfying -k &lt;= p(i)-i &lt;= r and p(i)-i not in the set I, i=1..n, with k=2, r=4, I={-1,1,2,3}.
 * @author Sean A. Irvine
 */
public class A224809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224809() {
    super(new long[] {-1, 0, 0, 1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 4, 6, 9});
  }
}
