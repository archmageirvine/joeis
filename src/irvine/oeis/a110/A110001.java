package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110001 n followed by n^2 followed by n^3 followed by n^4.
 * @author Sean A. Irvine
 */
public class A110001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110001() {
    super(1, new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 4, 8, 16, 3, 9, 27, 81, 4, 16, 64, 256, 5, 25, 125, 625});
  }
}
