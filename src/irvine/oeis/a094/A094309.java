package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094309 Number of (s(0), s(1), ..., s(n)) such that 0 &lt; s(i) &lt; 6 and |s(i) - s(i-1)| &lt;= 1 for i = 1,2,...,n, s(0) = 2, s(n) = 5.
 * @author Sean A. Irvine
 */
public class A094309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094309() {
    super(new long[] {-4, -2, 4}, new long[] {1, 4, 14});
  }
}
