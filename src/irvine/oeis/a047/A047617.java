package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047617 Numbers that are congruent to {2, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047617() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 5, 10});
  }
}
