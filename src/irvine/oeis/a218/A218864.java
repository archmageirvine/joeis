package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218864 Numbers of the form 9*k^2 + 8*k, k an integer.
 * @author Sean A. Irvine
 */
public class A218864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218864() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 17, 20, 52});
  }
}
