package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047470 Numbers that are congruent to {0, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047470() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 3, 8});
  }
}
