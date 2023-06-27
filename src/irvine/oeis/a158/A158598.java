package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158598 a(n) = 40*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158598() {
    super(1, new long[] {1, -3, 3}, new long[] {39, 159, 359});
  }
}
