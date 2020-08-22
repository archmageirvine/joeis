package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258810 a(n) = n^9 - 1.
 * @author Sean A. Irvine
 */
public class A258810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258810() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 511, 19682, 262143, 1953124, 10077695, 40353606, 134217727, 387420488, 999999999});
  }
}
