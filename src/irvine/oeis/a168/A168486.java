package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168486 Numbers that are congruent to {2, 5} mod 11.
 * @author Sean A. Irvine
 */
public class A168486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168486() {
    super(new long[] {-1, 1, 1}, new long[] {2, 5, 13});
  }
}
