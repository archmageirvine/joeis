package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178218 Numbers of the form 2k^2-2k+1 or 2k^2-1.
 * @author Sean A. Irvine
 */
public class A178218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178218() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 5, 7, 13});
  }
}
