package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070486 a(n) = n^3 mod 24 (or equivalently, n^5 mod 24).
 * @author Sean A. Irvine
 */
public class A070486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070486() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 8, 3, 16, 5, 0, 7, 8, 9, 16, 11, 0, 13, 8, 15, 16, 17, 0, 19, 8, 21, 16, 23});
  }
}
