package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157653 a(n) = 80000*n^2 - 39200*n + 4801.
 * @author Sean A. Irvine
 */
public class A157653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157653() {
    super(1, new long[] {1, -3, 3}, new long[] {45601, 246401, 607201});
  }
}
