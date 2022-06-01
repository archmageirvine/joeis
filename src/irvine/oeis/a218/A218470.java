package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218470 Partial sums of floor(n/9).
 * @author Sean A. Irvine
 */
public class A218470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218470() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
