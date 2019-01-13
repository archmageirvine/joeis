package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211536.
 * @author Sean A. Irvine
 */
public class A211536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211536() {
    super(new long[] {1, -1, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {0, 0, 0, 2, 3, 4, 6, 8, 11, 14});
  }
}
