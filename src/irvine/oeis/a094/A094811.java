package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094811 Number of (s(0), s(1), ..., s(2n+1)) such that 0 &lt; s(i) &lt; 8 and |s(i) - s(i-1)| = 1 for i = 1,2,...,2n+1, s(0) = 1, s(2n+1) = 6.
 * @author Sean A. Irvine
 */
public class A094811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094811() {
    super(2, new long[] {4, -10, 6}, new long[] {1, 6, 26});
  }
}
