package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290775 Number of 5-cycles in the n-triangular honeycomb bishop graph.
 * @author Sean A. Irvine
 */
public class A290775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290775() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 2, 24, 138, 532, 1596});
  }
}
