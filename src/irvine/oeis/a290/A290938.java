package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290938 Number of dominating sets in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A290938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290938() {
    super(1, new long[] {2, 3, 3, -2, -12, 7}, new long[] {5, 23, 83, 291, 1015, 3539});
  }
}
