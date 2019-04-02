package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047394 Numbers that are congruent to {0, 1, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047394() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 6, 8});
  }
}
