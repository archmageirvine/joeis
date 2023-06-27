package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047542 Numbers that are congruent to {0, 1, 2, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047542() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 7, 8});
  }
}
