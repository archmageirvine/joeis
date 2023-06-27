package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047622 Numbers that are congruent to {0, 3, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047622() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 3, 5, 8});
  }
}
