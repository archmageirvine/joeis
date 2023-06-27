package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047504 Numbers that are congruent to {1, 2, 3, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047504() {
    super(1, new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 2, 3, 4, 5, 7});
  }
}
