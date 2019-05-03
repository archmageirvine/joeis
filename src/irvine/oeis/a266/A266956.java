package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266956 Numbers m such that <code>9*m+7</code> is a square.
 * @author Sean A. Irvine
 */
public class A266956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266956() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 18, 21, 53});
  }
}
