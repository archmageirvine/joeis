package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054469 A second-order recursive sequence.
 * @author Sean A. Irvine
 */
public class A054469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054469() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {1, 7, 28, 85, 218, 499, 1053});
  }
}
