package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047507 Numbers that are congruent to {0, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047507() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 6, 7, 8});
  }
}
