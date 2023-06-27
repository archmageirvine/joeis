package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088225 Solutions to x^n == 7 (mod 11).
 * @author Sean A. Irvine
 */
public class A088225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088225() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {2, 6, 7, 8, 13});
  }
}
