package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036666 Numbers k such that 5*k + 1 is a square.
 * @author Sean A. Irvine
 */
public class A036666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036666() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 16, 24});
  }
}
