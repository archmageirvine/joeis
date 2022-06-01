package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036117 a(n) = 2^n mod 11.
 * @author Sean A. Irvine
 */
public class A036117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036117() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 5, 10});
  }
}
