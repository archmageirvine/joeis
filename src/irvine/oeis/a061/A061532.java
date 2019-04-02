package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061532 Nearest integer to n^7/49.
 * @author Sean A. Irvine
 */
public class A061532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061532() {
    super(new long[] {-1, 7, -21, 35, -35, 21, -7, 2, -7, 21, -35, 35, -21, 7}, new long[] {0, 3, 45, 334, 1594, 5713, 16807, 42799, 97612, 204082, 397697, 731261, 1280582, 2151296});
  }
}
