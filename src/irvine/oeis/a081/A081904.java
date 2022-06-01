package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081904 A sequence related to binomial(n+6, 6).
 * @author Sean A. Irvine
 */
public class A081904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081904() {
    super(new long[] {2187, -5103, 5103, -2835, 945, -189, 21}, new long[] {1, 9, 60, 344, 1794, 8754, 40636});
  }
}
