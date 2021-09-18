package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276598 Values of m such that m^2 + 3 is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A276598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276598() {
    super(new long[] {-1, 6}, new long[] {0, 5});
  }
}
