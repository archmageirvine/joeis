package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276647 Number of squares after the n-th generation in a symmetric <code>(with 45&#176; angles) non-overlapping</code> Pythagoras tree.
 * @author Sean A. Irvine
 */
public class A276647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276647() {
    super(new long[] {-2, 6, -5, -1, 3}, new long[] {1, 3, 7, 15, 31});
  }
}
