package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137232.
 * @author Sean A. Irvine
 */
public class A137232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137232() {
    super(new long[] {3, 7, -1}, new long[] {0, 0, 1});
  }
}
