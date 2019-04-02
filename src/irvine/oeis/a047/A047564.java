package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047564 Numbers that are congruent to {1, 3, 4, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047564() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 3, 4, 5, 6, 7});
  }
}
