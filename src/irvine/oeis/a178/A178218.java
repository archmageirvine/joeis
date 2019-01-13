package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178218.
 * @author Sean A. Irvine
 */
public class A178218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178218() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 7, 13});
  }
}
