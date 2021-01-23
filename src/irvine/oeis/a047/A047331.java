package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047331 Numbers that are congruent to {2, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047331() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 5, 6, 9});
  }
}
