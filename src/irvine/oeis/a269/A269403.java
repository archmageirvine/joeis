package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269403.
 * @author Sean A. Irvine
 */
public class A269403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269403() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 2, 3, 6, 10, 16});
  }
}
