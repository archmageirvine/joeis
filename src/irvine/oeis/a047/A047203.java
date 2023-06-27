package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047203 Numbers that are congruent to {0, 2, 3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047203() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 3, 4, 5});
  }
}
