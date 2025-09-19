package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157824 a(n) = 3600*n^2 - 6751*n + 3165.
 * @author Sean A. Irvine
 */
public class A157824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157824() {
    super(1, new long[] {1, -3, 3}, new long[] {14, 4063, 15312});
  }
}
