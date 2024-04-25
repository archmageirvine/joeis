package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054554 a(n) = 4*n^2 - 10*n + 7.
 * @author Sean A. Irvine
 */
public class A054554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054554() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 3, 13});
  }
}
