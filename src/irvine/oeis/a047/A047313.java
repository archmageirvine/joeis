package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047313 Numbers that are congruent to {1, 4, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047313() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 5, 6, 8});
  }
}
