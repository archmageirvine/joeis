package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290608 Number of maximal independent vertex sets (and minimal vertex covers) in the n-Moebius ladder graph.
 * @author Sean A. Irvine
 */
public class A290608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290608() {
    super(3, new long[] {1, 2, 1, 0}, new long[] {2, 8, 12, 16});
  }
}
