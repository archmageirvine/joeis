package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279438.
 * @author Sean A. Irvine
 */
public class A279438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279438() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 90, 1428, 10600, 51525, 190806, 584080, 1552608});
  }
}
