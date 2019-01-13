package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266607.
 * @author Sean A. Irvine
 */
public class A266607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266607() {
    super(new long[] {32, 0, -50, 0, 19, 0}, new long[] {1, 6, 2, 125, 4, 2043});
  }
}
