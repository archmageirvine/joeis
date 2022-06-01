package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293296 a(n) = 2*n^2 - floor(n/4).
 * @author Sean A. Irvine
 */
public class A293296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293296() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 2, 8, 18, 31, 49});
  }
}
