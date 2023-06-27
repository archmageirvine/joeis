package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290779 Number of 6-cycles in the n-triangular honeycomb bishop graph.
 * @author Sean A. Irvine
 */
public class A290779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290779() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 1, 57, 486, 2360, 8394, 24354});
  }
}
