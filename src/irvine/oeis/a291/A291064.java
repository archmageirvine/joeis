package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291064 a(n) = 2^n*(n + 1) - 3*(n - 1).
 * @author Sean A. Irvine
 */
public class A291064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291064() {
    super(1, new long[] {-4, 12, -13, 6}, new long[] {4, 9, 26, 71});
  }
}
