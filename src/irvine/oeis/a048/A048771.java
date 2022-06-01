package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048771 Partial sums of A048695.
 * @author Sean A. Irvine
 */
public class A048771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048771() {
    super(new long[] {-1, -1, 3}, new long[] {1, 9, 26});
  }
}
