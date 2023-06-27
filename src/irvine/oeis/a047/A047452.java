package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047452 Numbers that are congruent to {1, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047452() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 6, 9});
  }
}
