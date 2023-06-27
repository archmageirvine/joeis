package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047204 Numbers that are congruent to {3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047204() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 4, 8});
  }
}
