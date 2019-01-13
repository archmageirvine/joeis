package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279483.
 * @author Sean A. Irvine
 */
public class A279483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279483() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 0, 0, 8, 24, 144, 240, 672, 960});
  }
}
