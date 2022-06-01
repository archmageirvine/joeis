package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036120 a(n) = 2^n mod 19.
 * @author Sean A. Irvine
 */
public class A036120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036120() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 13, 7, 14, 9, 18});
  }
}
