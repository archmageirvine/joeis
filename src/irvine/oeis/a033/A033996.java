package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033996 8 times triangular numbers: a(n) = 4*n*(n+1).
 * @author Sean A. Irvine
 */
public class A033996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033996() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 24});
  }
}
