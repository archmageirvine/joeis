package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094286 Number of (s(0), s(1), ..., s(n)) such that 0 &lt; s(i) &lt; 6 and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 1, s(n) = 1.
 * @author Sean A. Irvine
 */
public class A094286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094286() {
    super(1, new long[] {4, -2, -6, 5}, new long[] {1, 2, 4, 9});
  }
}
