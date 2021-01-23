package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047420 Numbers that are congruent to {0, 1, 2, 3, 4, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047420() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 2, 3, 4, 6});
  }
}
