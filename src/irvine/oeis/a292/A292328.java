package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292328 p-INVERT of the Fibonacci sequence (A000045), where p(S) = (1 - S)^3.
 * @author Sean A. Irvine
 */
public class A292328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292328() {
    super(new long[] {1, 6, 9, -4, -9, 6}, new long[] {3, 9, 28, 84, 246, 707});
  }
}
