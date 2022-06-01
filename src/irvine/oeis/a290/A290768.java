package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290768 a(n) = 3/2*(n^2 - n + 2).
 * @author Sean A. Irvine
 */
public class A290768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290768() {
    super(new long[] {1, -3, 3}, new long[] {3, 6, 12});
  }
}
