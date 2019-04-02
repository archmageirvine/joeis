package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047284 Numbers that are congruent to {2, 3, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047284() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 6, 9});
  }
}
