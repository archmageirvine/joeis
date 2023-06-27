package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047207 Numbers that are congruent to {0, 1, 3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047207() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 4, 5});
  }
}
