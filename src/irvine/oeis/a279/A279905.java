package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279905.
 * @author Sean A. Irvine
 */
public class A279905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279905() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 16, 72, 216, 480, 960});
  }
}
