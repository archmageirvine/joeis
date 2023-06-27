package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181433 Numbers k such that 11*k is 5 less than a square.
 * @author Sean A. Irvine
 */
public class A181433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181433() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 20, 29, 61});
  }
}
