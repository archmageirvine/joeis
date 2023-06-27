package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047251 Numbers that are congruent to {1, 3, 4, 5} (mod 6).
 * @author Sean A. Irvine
 */
public class A047251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047251() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {1, 3, 4, 5});
  }
}
