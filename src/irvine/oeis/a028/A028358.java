package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028358 Partial sums of A028357.
 * @author Sean A. Irvine
 */
public class A028358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028358() {
    super(new long[] {1, -3, 3, 0, -3, 3}, new long[] {1, 4, 10, 20, 33, 48});
  }
}
