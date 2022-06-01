package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047246 Numbers that are congruent to {0, 1, 2, 3} mod 6.
 * @author Sean A. Irvine
 */
public class A047246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047246() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 3, 6});
  }
}
