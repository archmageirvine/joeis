package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153978 a(n) = n*(n-1)*(n+1)*(3*n-2)/12.
 * @author Sean A. Irvine
 */
public class A153978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153978() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 14, 50, 130});
  }
}
