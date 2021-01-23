package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047291 Numbers that are congruent to {0, 1, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047291() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 6, 7});
  }
}
