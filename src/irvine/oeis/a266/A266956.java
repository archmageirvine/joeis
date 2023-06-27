package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266956 Numbers m such that 9*m+7 is a square.
 * @author Sean A. Irvine
 */
public class A266956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266956() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 18, 21, 53});
  }
}
