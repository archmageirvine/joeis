package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266087 Alternating sum of <code>11-gonal</code> (or hendecagonal) numbers.
 * @author Sean A. Irvine
 */
public class A266087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266087() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, -1, 10, -20});
  }
}
