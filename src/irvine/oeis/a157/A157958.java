package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157958 a(n) = 242*n + 1.
 * @author Sean A. Irvine
 */
public class A157958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157958() {
    super(1, new long[] {-1, 2}, new long[] {243, 485});
  }
}
