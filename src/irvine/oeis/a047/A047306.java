package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047306 Numbers that are congruent to {0, 2, 3, 4, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047306() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 5, 6, 7});
  }
}
