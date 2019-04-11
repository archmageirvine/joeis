package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110426 The r-th term of the n-th row of the following array contains the sum of r successively decreasing integers beginning from <code>n.</code> 0&lt;r&lt;=n. e.g. the row corresponding to 4 contains <code>4, (3+2),{(1) +(0)+(-1)}, {(-2)+(-3)+(-4)+(-5)} ----&gt; 4,5,0,-14 1 2 1 3 3 -3 4 5 0 -14 5 7 3 -10 -35 6 9 6 -6 -30 -69 ...</code> Sequence contains the row sums.
 * @author Sean A. Irvine
 */
public class A110426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110426() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 3, -5, -30});
  }
}
