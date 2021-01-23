package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110008 n followed by n^4 followed by n^3 followed by n^2.
 * @author Sean A. Irvine
 */
public class A110008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110008() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 16, 8, 4, 3, 81, 27, 9, 4, 256, 64, 16, 5, 625, 125, 25});
  }
}
