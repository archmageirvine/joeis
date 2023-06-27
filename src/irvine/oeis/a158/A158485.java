package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158485 a(n) = 14*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158485() {
    super(1, new long[] {1, -3, 3}, new long[] {13, 55, 125});
  }
}
