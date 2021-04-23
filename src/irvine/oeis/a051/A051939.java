package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051939 Truncated triangular pyramid numbers: a(n) = (n-5)*(n^2+8*n-66)/6.
 * @author Sean A. Irvine
 */
public class A051939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051939() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 13, 31, 58});
  }
}
