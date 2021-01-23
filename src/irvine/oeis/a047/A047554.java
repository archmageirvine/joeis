package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047554 Numbers that are congruent to {1, 2, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047554() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 6, 7, 9});
  }
}
