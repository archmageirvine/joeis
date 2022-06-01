package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126420 a(n) = n^3 - n - 1.
 * @author Sean A. Irvine
 */
public class A126420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126420() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 5, 23, 59});
  }
}
