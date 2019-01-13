package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143945.
 * @author Sean A. Irvine
 */
public class A143945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143945() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 8, 72, 320, 1000, 2520});
  }
}
