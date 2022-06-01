package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047544 Numbers that are congruent to {1, 3, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047544() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 4, 7, 9});
  }
}
