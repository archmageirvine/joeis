package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157106 5651522n^2 - 2541672n + 285769.
 * @author Sean A. Irvine
 */
public class A157106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157106() {
    super(new long[] {1, -3, 3}, new long[] {3395619, 17808513, 43524451});
  }
}
