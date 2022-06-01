package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047231 Numbers that are congruent to {0, 3, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047231() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 4, 6});
  }
}
