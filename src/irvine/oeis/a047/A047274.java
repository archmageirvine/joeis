package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047274 Numbers that are congruent to {0, 1} mod 7.
 * @author Sean A. Irvine
 */
public class A047274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047274() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 1, 7});
  }
}
