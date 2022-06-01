package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109256 a(n) = n^6 - 11n^4 + 36n^2 - 36.
 * @author Sean A. Irvine
 */
public class A109256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109256() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {-36, -10, -4, 126, 1820, 9614, 33660});
  }
}
