package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181527 Binomial transform of A113127; (1, 1, 3, 7, 15, 31, ...) convolved with (1, 3, 7, 15, 31, 63, ...).
 * @author Sean A. Irvine
 */
public class A181527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181527() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 4, 13, 38});
  }
}
