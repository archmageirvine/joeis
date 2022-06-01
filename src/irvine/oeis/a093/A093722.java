package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093722 Integers of the form (n^2 - 1) / 120.
 * @author Sean A. Irvine
 */
public class A093722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093722() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 3, 7, 8, 14, 20, 29, 31});
  }
}
