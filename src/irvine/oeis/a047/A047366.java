package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047366 Numbers that are congruent to {1, 3, 4, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047366() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 4, 5, 8});
  }
}
