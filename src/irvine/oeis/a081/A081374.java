package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081374 Size of "uniform" Hamming covers of distance 1, that is, Hamming covers in which all vectors of equal weight are treated the same, included or excluded from the cover together.
 * @author Sean A. Irvine
 */
public class A081374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081374() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 2, 2, 5});
  }
}
