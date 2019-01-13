package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269237.
 * @author Sean A. Irvine
 */
public class A269237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269237() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 34, 189, 616, 1525});
  }
}
