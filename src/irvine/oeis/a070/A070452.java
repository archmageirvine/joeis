package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070452 a(n) = n^2 mod 30.
 * @author Sean A. Irvine
 */
public class A070452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070452() {
    super(new long[] {1, 1, 0, -1, -1, 0, 1, 1, 0, -1, -1, 0, 1, 1, 0, -1, -1, 0, 1, 1, 0, -1, -1, 0, 1, 1, 0, -1}, new long[] {0, 1, 4, 9, 16, 25, 6, 19, 4, 21, 10, 1, 24, 19, 16, 15, 16, 19, 24, 1, 10, 21, 4, 19, 6, 25, 16, 9});
  }
}
