package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047620 Numbers that are congruent to {0, 1, 2, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047620() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 2, 5});
  }
}
