package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279313.
 * @author Sean A. Irvine
 */
public class A279313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279313() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7});
  }
}
