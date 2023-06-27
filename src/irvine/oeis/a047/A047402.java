package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047402 Numbers that are congruent to {2, 3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047402() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {2, 3, 6, 10});
  }
}
