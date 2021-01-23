package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094292 Number of (s(0), s(1), ..., s(n)) such that 0 &lt; s(i) &lt; 5 and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,....,n, s(0) = 2, s(n) = 4.
 * @author Sean A. Irvine
 */
public class A094292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094292() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 1, 3});
  }
}
