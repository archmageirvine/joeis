package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083034 Numbers that are congruent to {0, 1, 3, 5, 7, 8, 10} mod 12.
 * @author Sean A. Irvine
 */
public class A083034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083034() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 8, 10, 12});
  }
}
