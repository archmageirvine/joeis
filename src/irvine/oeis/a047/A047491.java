package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047491 Numbers that are congruent to {4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047491() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {4, 5, 7, 12});
  }
}
