package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178460 Partial sums of <code>floor(2^n/127)</code>.
 * @author Sean A. Irvine
 */
public class A178460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178460() {
    super(new long[] {2, -3, 1, 0, 0, 0, 0, -2, 3}, new long[] {0, 0, 0, 0, 0, 0, 1, 3, 7});
  }
}
