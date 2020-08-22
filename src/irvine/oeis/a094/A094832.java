package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094832 Number of (s(0), s(1), ..., s(2n+1)) such that 0 &lt; s(i) &lt; 9 and |s(i) - s(i-1)| = 1 for i = 1,2,...,2n+1, s(0) = 3, s(2n+1) = 4.
 * @author Sean A. Irvine
 */
public class A094832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094832() {
    super(new long[] {1, -9, 6}, new long[] {1, 3, 10});
  }
}
