package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047596 Numbers that are congruent to {2, 3, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047596() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 5, 10});
  }
}
