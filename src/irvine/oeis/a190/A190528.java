package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190528 Number of n-step one-sided prudent walks avoiding exactly three consecutive West steps.
 * @author Sean A. Irvine
 */
public class A190528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190528() {
    super(new long[] {1, -1, 0, 1, 2}, new long[] {1, 3, 7, 16, 39});
  }
}
