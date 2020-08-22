package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047510 Numbers that are congruent to {2, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047510() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 6, 7, 10});
  }
}
