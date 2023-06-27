package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287349 Number of matchings in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A287349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287349() {
    super(1, new long[] {-1, 6, -11, 6}, new long[] {4, 13, 42, 131});
  }
}
