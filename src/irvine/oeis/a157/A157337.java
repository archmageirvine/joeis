package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157337 a(n) = 128*n^2 + 32*n + 1.
 * @author Sean A. Irvine
 */
public class A157337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157337() {
    super(1, new long[] {1, -3, 3}, new long[] {161, 577, 1249});
  }
}
