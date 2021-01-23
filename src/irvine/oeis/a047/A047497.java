package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047497 Numbers that are congruent to {1, 2, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047497() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 7, 9});
  }
}
