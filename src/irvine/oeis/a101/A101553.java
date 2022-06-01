package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101553 A modular recurrence.
 * @author Sean A. Irvine
 */
public class A101553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101553() {
    super(new long[] {15, 0}, new long[] {1, 5});
  }
}
