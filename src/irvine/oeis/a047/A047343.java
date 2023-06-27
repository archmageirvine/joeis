package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047343 Numbers that are congruent to {1, 3, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047343() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 3, 4, 8});
  }
}
