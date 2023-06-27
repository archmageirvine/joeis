package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047602 Numbers that are congruent to {0, 1, 2, 3, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047602() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 8});
  }
}
