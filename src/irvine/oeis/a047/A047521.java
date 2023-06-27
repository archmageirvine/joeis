package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047521 Numbers that are congruent to {0, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047521() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 7, 8});
  }
}
