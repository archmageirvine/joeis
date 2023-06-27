package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047279 Numbers that are congruent to {0, 1, 2, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047279() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 6, 7});
  }
}
