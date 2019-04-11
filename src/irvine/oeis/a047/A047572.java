package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047572 Numbers that are congruent to <code>{1, 2, 4, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047572() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 6, 7, 9});
  }
}
