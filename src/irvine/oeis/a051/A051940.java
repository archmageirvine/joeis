package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051940 Truncated triangular numbers: n*(n+1)/2 - 3*t*(t+1)/2 with t=4.
 * @author Sean A. Irvine
 */
public class A051940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051940() {
    super(8, new long[] {1, -3, 3}, new long[] {6, 15, 25});
  }
}
