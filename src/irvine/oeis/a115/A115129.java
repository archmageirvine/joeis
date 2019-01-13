package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115129.
 * @author Sean A. Irvine
 */
public class A115129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115129() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {14, 56, 146, 311, 586, 1015});
  }
}
