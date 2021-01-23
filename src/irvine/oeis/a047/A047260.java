package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047260 Numbers that are congruent to {0, 1, 4, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047260() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 5, 6});
  }
}
