package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047578 Numbers that are congruent to {2, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047578() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {2, 5, 6, 7});
  }
}
