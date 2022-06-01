package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157370 a(n) = 2401*n^2 - 3822*n + 1520.
 * @author Sean A. Irvine
 */
public class A157370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157370() {
    super(new long[] {1, -3, 3}, new long[] {99, 3480, 11663});
  }
}
