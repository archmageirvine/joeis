package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047513 Numbers that are congruent to {0, 1, 2, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047513() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 2, 4, 6, 7});
  }
}
