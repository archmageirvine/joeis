package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227146 Numbers that are congruent to {5, 11, 13, 14, 19} modulo 24.
 * @author Sean A. Irvine
 */
public class A227146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227146() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 11, 13, 14, 19, 29});
  }
}
