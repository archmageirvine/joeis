package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047233 Numbers that are congruent to {0, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047233() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 6});
  }
}
