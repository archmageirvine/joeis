package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111913.
 * @author Sean A. Irvine
 */
public class A111913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111913() {
    super(new long[] {1, 0, -1, 0, -1, 0, 1, 0, 1, 0}, new long[] {0, 2, 3, 3, 3, 3, 6, 4, 5, 1});
  }
}
