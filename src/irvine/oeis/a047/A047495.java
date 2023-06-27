package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047495 Numbers that are congruent to {2, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047495() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {2, 4, 5, 7});
  }
}
