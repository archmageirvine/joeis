package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047576 Numbers that are congruent to {1, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047576() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 6, 7, 9});
  }
}
