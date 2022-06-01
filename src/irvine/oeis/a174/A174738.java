package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174738 Partial sums of floor(n/7).
 * @author Sean A. Irvine
 */
public class A174738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174738() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
