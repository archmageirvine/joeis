package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186042 Numbers of the form 2*k + 1, 3*k + 2, or 5*k + 3.
 * @author Sean A. Irvine
 */
public class A186042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186042() {
    super(1, new long[] {-1, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2, -2, 2}, new long[] {1, 2, 3, 5, 7, 8, 9, 11, 13, 14, 15, 17, 18, 19, 20, 21, 23, 25, 26, 27, 28, 29});
  }
}
