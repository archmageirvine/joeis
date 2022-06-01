package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161701 a(n) = (n^5 - 5*n^4 + 5*n^3 + 5*n^2 + 114*n + 120)/120.
 * @author Sean A. Irvine
 */
public class A161701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161701() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 3, 4, 6, 12});
  }
}
