package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144797 Numbers k such that 2*k^2 + 17 is a square.
 * @author Sean A. Irvine
 */
public class A144797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144797() {
    super(1, new long[] {-1, 0, 6, 0}, new long[] {2, 4, 16, 26});
  }
}
