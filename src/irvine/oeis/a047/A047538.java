package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047538 Numbers that are congruent to {0, 1, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047538() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 4, 7});
  }
}
