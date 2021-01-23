package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047623 Numbers that are congruent to {1, 3, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047623() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 5, 9});
  }
}
