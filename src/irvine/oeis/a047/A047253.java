package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047253 Numbers that are congruent to {1, 2, 3, 4, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047253() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 7});
  }
}
