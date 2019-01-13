package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119536.
 * @author Sean A. Irvine
 */
public class A119536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119536() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 30, 90});
  }
}
