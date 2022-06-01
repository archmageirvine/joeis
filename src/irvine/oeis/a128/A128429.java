package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128429 A linear recurrence sequence: a(n) = a(n-1) + a(n-3) + a(n-5) + a(n-6).
 * @author Sean A. Irvine
 */
public class A128429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128429() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
