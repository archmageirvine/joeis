package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157287 a(n) = 1728*n - 24.
 * @author Sean A. Irvine
 */
public class A157287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157287() {
    super(1, new long[] {-1, 2}, new long[] {1704, 3432});
  }
}
