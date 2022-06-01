package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219391 Numbers k such that 21*k + 1 is a square.
 * @author Sean A. Irvine
 */
public class A219391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219391() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 3, 8, 19, 23, 40, 55, 80, 88});
  }
}
