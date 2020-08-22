package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266313 Period 8 zigzag sequence; repeat [0, 1, 2, 3, 4, 3, 2, 1].
 * @author Sean A. Irvine
 */
public class A266313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266313() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
