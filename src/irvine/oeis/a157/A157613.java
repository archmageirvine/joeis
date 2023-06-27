package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157613 a(n) = 2662*n + 22.
 * @author Sean A. Irvine
 */
public class A157613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157613() {
    super(1, new long[] {-1, 2}, new long[] {2684, 5346});
  }
}
