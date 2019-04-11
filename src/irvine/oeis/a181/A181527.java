package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181527 Binomial transform of A113127; <code>(1, 1, 3, 7, 15, 31,...)</code> convolved with <code>(1, 3, 7, 15, 31, 63,...)</code>.
 * @author Sean A. Irvine
 */
public class A181527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181527() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 4, 13, 38});
  }
}
