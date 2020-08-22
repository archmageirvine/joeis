package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051936 Truncated triangular numbers: a(n) = n*(n+1)/2 - 9.
 * @author Sean A. Irvine
 */
public class A051936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051936() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 12});
  }
}
