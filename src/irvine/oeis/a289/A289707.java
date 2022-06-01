package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289707 Number of 6-cycles in the n-triangular honeycomb queen graph.
 * @author Sean A. Irvine
 */
public class A289707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289707() {
    super(new long[] {-1, 3, 1, -10, 3, 13, -3, -12, -3, 13, 3, -10, 1, 3}, new long[] {0, 0, 16, 911, 8013, 38130, 129932, 358272, 851710, 1815124, 3554910, 6510729, 11289019, 18704640});
  }
}
