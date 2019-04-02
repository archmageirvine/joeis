package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237997 Number of ordered ways to achieve a score of n in American football taking into account different scoring methods.
 * @author Sean A. Irvine
 */
public class A237997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237997() {
    super(new long[] {1, 1, 1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 3, 4});
  }
}
