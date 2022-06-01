package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268291 a(n) = Sum_{k = 0..n} (k mod 13).
 * @author Sean A. Irvine
 */
public class A268291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268291() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 78});
  }
}
