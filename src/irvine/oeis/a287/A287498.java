package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287498 Number of maximal independent vertex sets (and minimal vertex covers) in the n-web graph.
 * @author Sean A. Irvine
 */
public class A287498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287498() {
    super(new long[] {1, 3, 2, 0}, new long[] {0, 4, 9, 12});
  }
}
