package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047407 Numbers that are congruent to {0, 4, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047407() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 4, 6, 8});
  }
}
