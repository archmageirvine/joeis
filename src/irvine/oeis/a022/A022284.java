package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022284 a(n) = n*(27*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022284() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 53});
  }
}
