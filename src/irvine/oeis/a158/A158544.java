package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158544 a(n) = 24*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158544() {
    super(1, new long[] {1, -3, 3}, new long[] {23, 95, 215});
  }
}
