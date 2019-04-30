package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079962 Number of permutations satisfying <code>-k &lt;= p(i) - i &lt;=</code> r and <code>p(i) - i</code> not in I, <code>i=1..n</code>, with <code>k=1</code>, r=5, I={1,3}.
 * @author Sean A. Irvine
 */
public class A079962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079962() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 5});
  }
}
