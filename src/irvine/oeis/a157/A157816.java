package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157816 a(n) = 1482401250*n^2 - 108900*n + 1.
 * @author Sean A. Irvine
 */
public class A157816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157816() {
    super(1, new long[] {1, -3, 3}, new long[] {1482292351, 5929387201L, 13341284551L});
  }
}
