package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047338 Numbers that are congruent to {1, 2, 3, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047338() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 8});
  }
}
