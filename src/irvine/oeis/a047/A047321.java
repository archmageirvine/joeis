package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047321 Numbers that are congruent to {1, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047321() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 6, 8});
  }
}
