package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047397 Numbers that are congruent to {0, 1, 2, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047397() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 6, 8});
  }
}
