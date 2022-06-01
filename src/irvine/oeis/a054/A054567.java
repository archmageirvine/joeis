package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054567 a(n) = 4*n^2 - 7*n + 4.
 * @author Sean A. Irvine
 */
public class A054567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054567() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 19});
  }
}
