package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047237 Numbers that are congruent to {0, 1, 2, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047237() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 2, 4});
  }
}
