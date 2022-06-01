package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053545 Comparisons needed for Batcher's sorting algorithm applied to 2^n items.
 * @author Sean A. Irvine
 */
public class A053545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053545() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 1, 5, 19});
  }
}
