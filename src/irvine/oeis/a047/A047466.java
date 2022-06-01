package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047466 Numbers that are congruent to {0, 1, 2, 4} mod 8.
 * @author Sean A. Irvine
 */
public class A047466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047466() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 4, 8});
  }
}
