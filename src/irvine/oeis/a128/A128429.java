package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128429.
 * @author Sean A. Irvine
 */
public class A128429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128429() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
