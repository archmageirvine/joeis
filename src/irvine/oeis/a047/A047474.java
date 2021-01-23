package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047474 Numbers that are congruent to {0, 2, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047474() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 3, 8});
  }
}
