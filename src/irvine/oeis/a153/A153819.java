package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153819 Linear recurrence with a(n) = 3a(n-1) - a(n-2) + 2 = 4a(n-1) - 4a(n-2) + a(n-3). Full sequence for A153466.
 * @author Sean A. Irvine
 */
public class A153819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153819() {
    super(new long[] {1, -4, 4}, new long[] {16, 34, 88});
  }
}
