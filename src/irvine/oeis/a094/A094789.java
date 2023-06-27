package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094789 Number of (s(0), s(1), ..., s(2n+1)) such that 0 &lt; s(i) &lt; 7 and |s(i) - s(i-1)| = 1 for i = 1,2,...,2n+1, s(0) = 1, s(2n+1) = 4.
 * @author Sean A. Irvine
 */
public class A094789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094789() {
    super(1, new long[] {1, -6, 5}, new long[] {1, 4, 14});
  }
}
