package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181433 Numbers k such that <code>11*k</code> is 5 less than a square.
 * @author Sean A. Irvine
 */
public class A181433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181433() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 20, 29, 61});
  }
}
