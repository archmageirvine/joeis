package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047557 Numbers that are congruent to {0, 3, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047557() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 3, 6, 7});
  }
}
