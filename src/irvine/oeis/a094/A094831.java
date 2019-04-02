package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094831 Number of (s(0), s(1), ..., s(2n)) such that 0 &lt; s(i) &lt; 9 and |s(i) - s(i-1)| = 1 for i = 1,2,....,2n, s(0) = 3, s(2n) = 3.
 * @author Sean A. Irvine
 */
public class A094831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094831() {
    super(new long[] {1, -9, 6}, new long[] {1, 2, 6});
  }
}
