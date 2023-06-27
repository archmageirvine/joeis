package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047426 Numbers that are congruent to {0, 3, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047426() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 3, 4, 5, 6, 8});
  }
}
