package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051941 Truncated triangular pyramid numbers: a(n) = (n-7)*(n^2 + 10*n - 108)/6, n &gt;= 8.
 * @author Sean A. Irvine
 */
public class A051941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051941() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 21, 46, 82});
  }
}
