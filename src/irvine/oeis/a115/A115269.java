package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115269.
 * @author Sean A. Irvine
 */
public class A115269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115269() {
    super(new long[] {1, -2, 0, 2, -3, 4, 0, -4, 3, -2, 0, 2}, new long[] {1, 2, 4, 6, 11, 16, 24, 32, 46, 60, 80, 100});
  }
}
