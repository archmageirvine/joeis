package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290940 Number of 6-cycles in the n-triangular graph.
 * @author Sean A. Irvine
 */
public class A290940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290940() {
    super(2, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 16, 920, 7800, 36260, 122080, 334656});
  }
}
