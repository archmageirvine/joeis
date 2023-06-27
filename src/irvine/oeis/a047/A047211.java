package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047211 Numbers that are congruent to {2, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047211() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 4, 7});
  }
}
