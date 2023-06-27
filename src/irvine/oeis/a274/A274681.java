package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274681 Numbers k such that 4*k + 1 is a triangular number.
 * @author Sean A. Irvine
 */
public class A274681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274681() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 11, 26, 38});
  }
}
