package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266957 Numbers m such that <code>9*m+10</code> is a square.
 * @author Sean A. Irvine
 */
public class A266957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266957() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {-1, 6, 10, 31, 39});
  }
}
