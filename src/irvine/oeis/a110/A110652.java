package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110652 n^2 followed by n^3 followed by n^4 followed by n.
 * @author Sean A. Irvine
 */
public class A110652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110652() {
    super(1, new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 4, 8, 16, 2, 9, 27, 81, 3, 16, 64, 256, 4, 25, 125, 625, 5});
  }
}
