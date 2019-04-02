package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047256 Numbers that are congruent to {0, 1, 2, 3, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047256() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 5, 6});
  }
}
