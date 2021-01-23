package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047302 Numbers that are congruent to {1, 2, 3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047302() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 6, 8});
  }
}
