package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047401 Numbers that are congruent to {0, 1, 3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047401() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 3, 6});
  }
}
