package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047275 Numbers that are congruent to {0, 1, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047275() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 1, 6, 7});
  }
}
