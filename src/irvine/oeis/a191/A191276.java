package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191276.
 * @author Sean A. Irvine
 */
public class A191276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191276() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 4, 5, 7, 8, 11, 12});
  }
}
