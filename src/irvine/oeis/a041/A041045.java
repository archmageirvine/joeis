package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041045.
 * @author Sean A. Irvine
 */
public class A041045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041045() {
    super(new long[] {-1, 0, 0, 0, 254, 0, 0, 0}, new long[] {1, 3, 7, 24, 247, 765, 1777, 6096});
  }
}
