package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284702 Number of dominating sets in the n-prism graph.
 * @author Sean A. Irvine
 */
public class A284702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284702() {
    super(1, new long[] {-1, -1, 1, 1, 5, 1, 3}, new long[] {3, 11, 51, 183, 663, 2435, 8935});
  }
}
