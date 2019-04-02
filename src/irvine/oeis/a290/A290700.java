package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290700 Number of minimal edge covers in the n-prism graph.
 * @author Sean A. Irvine
 */
public class A290700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290700() {
    super(new long[] {1, -1, -2, -2, 2, 2, 6, 2, 1}, new long[] {1, 5, 25, 49, 141, 389, 1009, 2761, 7441});
  }
}
