package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036130 a(n) = 2^n mod 61.
 * @author Sean A. Irvine
 */
public class A036130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036130() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 3, 6, 12, 24, 48, 35, 9, 18, 36, 11, 22, 44, 27, 54, 47, 33, 5, 10, 20, 40, 19, 38, 15, 30, 60});
  }
}
