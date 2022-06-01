package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290707 a(n) = 2^(n+1) + n^2 - 1.
 * @author Sean A. Irvine
 */
public class A290707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290707() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 4, 11, 24});
  }
}
