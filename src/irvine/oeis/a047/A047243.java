package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047243 Numbers that are congruent to {2, 3} mod 6.
 * @author Sean A. Irvine
 */
public class A047243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047243() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 3, 8});
  }
}
