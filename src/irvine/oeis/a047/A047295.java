package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047295 Numbers that are congruent to {0, 1, 2, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047295() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 6, 7});
  }
}
