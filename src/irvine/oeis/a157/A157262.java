package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157262 a(n) = 36*n^2 - 55*n + 21.
 * @author Sean A. Irvine
 */
public class A157262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157262() {
    super(new long[] {1, -3, 3}, new long[] {2, 55, 180});
  }
}
