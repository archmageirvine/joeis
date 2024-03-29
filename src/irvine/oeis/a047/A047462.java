package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047462 Numbers that are congruent to {0, 1, 4} mod 8.
 * @author Sean A. Irvine
 */
public class A047462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047462() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 1, 4, 8});
  }
}
