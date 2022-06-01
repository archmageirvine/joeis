package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047303 Numbers that are congruent to {0, 1, 2, 3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047303() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 6, 7});
  }
}
