package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266769.
 * @author Sean A. Irvine
 */
public class A266769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266769() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {1, 1, 3, 4, 7, 9, 14, 17});
  }
}
