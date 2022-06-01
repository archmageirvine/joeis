package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047430 Numbers that are congruent to {0, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047430() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 5, 6, 8});
  }
}
