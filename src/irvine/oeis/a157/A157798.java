package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157798 a(n) = 1482401250*n^2 - 658736100*n + 73180801.
 * @author Sean A. Irvine
 */
public class A157798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157798() {
    super(new long[] {1, -3, 3}, new long[] {896845951, 4685313601L, 11438583751L});
  }
}
