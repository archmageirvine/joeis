package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036124 a(n) = 2^n mod 37.
 * @author Sean A. Irvine
 */
public class A036124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036124() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 27, 17, 34, 31, 25, 13, 26, 15, 30, 23, 9, 18, 36});
  }
}
