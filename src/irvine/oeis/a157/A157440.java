package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157440 a(n) = 121*n^2 - 204*n + 86.
 * @author Sean A. Irvine
 */
public class A157440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157440() {
    super(new long[] {1, -3, 3}, new long[] {3, 162, 563});
  }
}
