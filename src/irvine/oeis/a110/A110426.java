package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110426 The r-th term of the n-th row of the following array contains the sum of r successively decreasing integers beginning from n, 0 &lt; r &lt;= n (see Example).
 * @author Sean A. Irvine
 */
public class A110426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110426() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 3, -5, -30});
  }
}
