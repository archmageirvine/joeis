package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047609 Numbers that are congruent to {0, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047609() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 4, 5, 8});
  }
}
