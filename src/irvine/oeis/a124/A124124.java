package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124124 Nonnegative integers n such that 2n^2 + 2n - 3 is square.
 * @author Sean A. Irvine
 */
public class A124124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124124() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {1, 2, 6, 13, 37});
  }
}
