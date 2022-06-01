package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047586 Numbers that are congruent to {2, 3, 5, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047586() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 5, 6, 7, 10});
  }
}
