package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047515 Numbers that are congruent to {0, 3, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047515() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 3, 4, 6, 7, 8});
  }
}
