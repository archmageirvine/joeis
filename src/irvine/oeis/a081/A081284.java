package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081284.
 * @author Sean A. Irvine
 */
public class A081284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081284() {
    super(new long[] {-1, 2, 3, -8, -2, 12, -2, -8, 3, 2}, new long[] {0, 1, 1, 6, 7, 22, 27, 62, 77, 147});
  }
}
