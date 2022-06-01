package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047490 Numbers that are congruent to {0, 1, 2, 3, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047490() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 2, 3, 5, 7});
  }
}
