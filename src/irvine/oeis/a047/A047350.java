package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047350 Numbers that are congruent to {1, 2, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047350() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 8});
  }
}
