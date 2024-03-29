package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157446 a(n) = 16*n^2 - n.
 * @author Sean A. Irvine
 */
public class A157446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157446() {
    super(1, new long[] {1, -3, 3}, new long[] {15, 62, 141});
  }
}
