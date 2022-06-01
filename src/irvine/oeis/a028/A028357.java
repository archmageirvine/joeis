package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028357 Partial sums of A028356.
 * @author Sean A. Irvine
 */
public class A028357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028357() {
    super(new long[] {-1, 2, -1, -1, 2}, new long[] {1, 3, 6, 10, 13});
  }
}
