package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047373 Numbers that are congruent to {0, 1, 2, 3, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047373() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 5, 7});
  }
}
