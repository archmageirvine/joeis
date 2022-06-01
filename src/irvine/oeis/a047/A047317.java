package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047317 Numbers that are congruent to {1, 2, 4, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047317() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 6, 8});
  }
}
