package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047225 Numbers that are congruent to {0, 1} mod 6.
 * @author Sean A. Irvine
 */
public class A047225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047225() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 6});
  }
}
