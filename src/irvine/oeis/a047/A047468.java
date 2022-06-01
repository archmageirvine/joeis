package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047468 Numbers that are congruent to {1, 2} mod 8.
 * @author Sean A. Irvine
 */
public class A047468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047468() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 9});
  }
}
