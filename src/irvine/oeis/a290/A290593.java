package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290593 Number of maximal independent vertex sets (and minimal vertex covers) in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A290593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290593() {
    super(3, new long[] {1, 0, 1, 1}, new long[] {3, 12, 15, 31});
  }
}
