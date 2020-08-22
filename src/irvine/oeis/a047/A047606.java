package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047606 Numbers that are congruent to {1, 2, 3, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047606() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 5, 9});
  }
}
