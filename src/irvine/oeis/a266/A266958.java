package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266958 Numbers m such that <code>9*m+13</code> is a square.
 * @author Sean A. Irvine
 */
public class A266958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266958() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {-1, 4, 12, 27, 43});
  }
}
