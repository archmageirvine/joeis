package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047575 Numbers that are congruent to {0, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047575() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 5, 6, 7, 8});
  }
}
