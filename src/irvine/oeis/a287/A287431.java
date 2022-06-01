package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287431 Number of connected dominating sets in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A287431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287431() {
    super(new long[] {4, -6, -1, 4}, new long[] {7, 21, 45, 129});
  }
}
