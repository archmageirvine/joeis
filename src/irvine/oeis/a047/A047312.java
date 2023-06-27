package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047312 Numbers that are congruent to {0, 4, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047312() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 5, 6, 7});
  }
}
