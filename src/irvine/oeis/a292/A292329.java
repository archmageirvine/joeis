package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292329 p-INVERT of the Fibonacci sequence (A000045), where p(S) = 1 - S^3.
 * @author Sean A. Irvine
 */
public class A292329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292329() {
    super(new long[] {1, 3, 0, -4, 0, 3}, new long[] {0, 0, 1, 3, 9, 23});
  }
}
