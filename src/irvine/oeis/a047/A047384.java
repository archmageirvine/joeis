package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047384 Numbers that are congruent to {0, 1, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047384() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 1, 5, 7});
  }
}
