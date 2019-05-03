package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224809 Number of permutations <code>(p(1), p(2)</code>, ..., <code>p(n))</code> satisfying <code>-k &lt;= p(i)-i &lt;=</code> r and <code>p(i)-i</code> not in the set I, <code>i=1..n</code>, with <code>k=2, r=4, I={-1,1,2,3}</code>.
 * @author Sean A. Irvine
 */
public class A224809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224809() {
    super(new long[] {-1, 0, 0, 1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 4, 6, 9});
  }
}
