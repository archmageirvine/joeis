package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287350 Number of independent vertex sets and vertex covers in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A287350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287350() {
    super(new long[] {2, -7, 5}, new long[] {5, 11, 26});
  }
}
