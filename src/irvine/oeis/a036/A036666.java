package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036666 Numbers k such that 5*k <code>+ 1</code> is a square.
 * @author Sean A. Irvine
 */
public class A036666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036666() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 16, 24});
  }
}
