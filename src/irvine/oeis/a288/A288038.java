package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288038 Number of independent vertex sets in the n-Andrasfai graph.
 * @author Sean A. Irvine
 */
public class A288038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288038() {
    super(1, new long[] {4, -8, 5}, new long[] {3, 11, 33});
  }
}
