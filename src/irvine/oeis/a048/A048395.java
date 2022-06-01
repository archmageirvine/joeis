package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048395 Sum of consecutive nonsquares.
 * @author Sean A. Irvine
 */
public class A048395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048395() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 26, 75});
  }
}
