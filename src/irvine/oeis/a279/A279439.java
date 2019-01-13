package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279439.
 * @author Sean A. Irvine
 */
public class A279439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279439() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 45, 2304, 34020, 270720, 1475145, 6209280, 21654864, 65422080, 176467005});
  }
}
