package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047400 Numbers that are congruent to {1, 3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047400() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 3, 6, 9});
  }
}
