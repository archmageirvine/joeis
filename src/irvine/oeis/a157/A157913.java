package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157913 a(n) = 64*n^2 - 16.
 * @author Sean A. Irvine
 */
public class A157913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157913() {
    super(1, new long[] {1, -3, 3}, new long[] {48, 240, 560});
  }
}
