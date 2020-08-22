package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047618 Numbers that are congruent to {0, 2, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047618() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 5, 8});
  }
}
