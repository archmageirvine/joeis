package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290379 Number of minimal dominating sets in the n-ladder graph.
 * @author Sean A. Irvine
 */
public class A290379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290379() {
    super(new long[] {2, 4, 5, 3, 2, 1, 4, 4, 3, 1, 0}, new long[] {2, 6, 7, 18, 39, 75, 155, 310, 638, 1295, 2624});
  }
}
