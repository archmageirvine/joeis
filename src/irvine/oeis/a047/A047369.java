package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047369 Numbers that are congruent to {1, 2, 3, 4, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047369() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 8});
  }
}
