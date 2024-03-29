package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047389 Numbers that are congruent to {3, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047389() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 5, 10});
  }
}
