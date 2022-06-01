package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047473 Numbers that are congruent to {2, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047473() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 10});
  }
}
