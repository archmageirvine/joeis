package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054554 a(n) = 4n^2 - 10n + 7.
 * @author Sean A. Irvine
 */
public class A054554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054554() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 13});
  }
}
