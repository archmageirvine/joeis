package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047217 Numbers that are congruent to {0, 1, 2} mod 5.
 * @author Sean A. Irvine
 */
public class A047217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047217() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 5});
  }
}
