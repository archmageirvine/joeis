package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047522 Numbers that are congruent to {1, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047522() {
    super(new long[] {-1, 1, 1}, new long[] {1, 7, 9});
  }
}
