package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157651 a(n) = 100*n^2 - 49*n + 6.
 * @author Sean A. Irvine
 */
public class A157651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157651() {
    super(1, new long[] {1, -3, 3}, new long[] {57, 308, 759});
  }
}
