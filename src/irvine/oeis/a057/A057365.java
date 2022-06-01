package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057365 a(n) = floor(13*n/21).
 * @author Sean A. Irvine
 */
public class A057365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057365() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 11, 11, 12, 13});
  }
}
