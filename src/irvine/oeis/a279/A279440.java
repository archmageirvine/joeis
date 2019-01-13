package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279440.
 * @author Sean A. Irvine
 */
public class A279440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279440() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 0, 6, 2040, 71400, 1005720, 8421630, 50092896, 233483040, 905925600, 3045791430L, 9125544120L, 24868110696L});
  }
}
