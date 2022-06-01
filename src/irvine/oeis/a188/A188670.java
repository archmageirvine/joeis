package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188670 A quasi-periodic solution to Hofstadter's Q recurrence.
 * @author Sean A. Irvine
 */
public class A188670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188670() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0}, new long[] {3, 6, 5, 3, 6, 8, 3, 6, 13});
  }
}
