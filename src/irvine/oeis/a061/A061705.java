package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061705 Number of matchings in the wheel graph with n spokes.
 * @author Sean A. Irvine
 */
public class A061705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061705() {
    super(new long[] {-1, -2, 1, 2}, new long[] {2, 5, 10, 19});
  }
}
