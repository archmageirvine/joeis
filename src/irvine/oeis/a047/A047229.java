package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047229 Numbers that are congruent to {0, 2, 3, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047229() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {0, 2, 3, 4});
  }
}
