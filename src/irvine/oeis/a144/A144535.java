package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144535.
 * @author Sean A. Irvine
 */
public class A144535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144535() {
    super(new long[] {-1, 0, 14, 0}, new long[] {0, 1, 6, 13});
  }
}
