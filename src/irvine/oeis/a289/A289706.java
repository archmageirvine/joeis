package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289706 Number of 5-cycles in the n-triangular honeycomb queen graph.
 * @author Sean A. Irvine
 */
public class A289706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289706() {
    super(new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4}, new long[] {0, 0, 24, 324, 1692, 5796, 15516, 35388, 71988, 134460});
  }
}
