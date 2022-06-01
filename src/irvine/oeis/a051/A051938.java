package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051938 Truncated triangular numbers: a(n) = n*(n+1)/2 - 18.
 * @author Sean A. Irvine
 */
public class A051938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051938() {
    super(new long[] {1, -3, 3}, new long[] {3, 10, 18});
  }
}
