package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288038 Number of independent vertex sets in the n-Andrasfai graph.
 * @author Sean A. Irvine
 */
public class A288038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288038() {
    super(new long[] {4, -8, 5}, new long[] {3, 11, 33});
  }
}
