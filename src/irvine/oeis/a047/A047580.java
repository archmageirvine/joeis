package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047580 Numbers that are congruent to <code>{1, 2, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047580() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 5, 6, 7, 9});
  }
}
