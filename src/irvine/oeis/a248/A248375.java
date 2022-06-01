package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248375 a(n) = floor(9*n/8).
 * @author Sean A. Irvine
 */
public class A248375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248375() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 9});
  }
}
