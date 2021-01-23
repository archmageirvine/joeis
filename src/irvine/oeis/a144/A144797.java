package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144797 Numbers n such that 2*n^2+17 is a square.
 * @author Sean A. Irvine
 */
public class A144797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144797() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 4, 16, 26});
  }
}
