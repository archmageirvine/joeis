package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180958 Diagonal sums of generalized Narayana triangle A180957.
 * @author Sean A. Irvine
 */
public class A180958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180958() {
    super(new long[] {-1, -3, 1, 2}, new long[] {1, 1, 2, 2});
  }
}
