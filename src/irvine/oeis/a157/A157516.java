package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157516 a(n) = 5000*n^2 - 200*n + 1.
 * @author Sean A. Irvine
 */
public class A157516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157516() {
    super(1, new long[] {1, -3, 3}, new long[] {4801, 19601, 44401});
  }
}
