package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047539 Numbers that are congruent to {2, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047539() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 4, 7, 10});
  }
}
