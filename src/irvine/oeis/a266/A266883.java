package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266883.
 * @author Sean A. Irvine
 */
public class A266883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266883() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 6, 15, 19});
  }
}
