package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047501 Numbers that are congruent to {1, 3, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047501() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 4, 5, 7, 9});
  }
}
