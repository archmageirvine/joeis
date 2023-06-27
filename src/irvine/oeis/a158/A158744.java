package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158744 a(n) = 74*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158744() {
    super(1, new long[] {1, -3, 3}, new long[] {73, 295, 665});
  }
}
