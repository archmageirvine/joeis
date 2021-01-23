package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047496 Numbers that are congruent to {0, 2, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047496() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 4, 5, 7, 8});
  }
}
