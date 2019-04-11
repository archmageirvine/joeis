package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047555 Numbers that are congruent to <code>{0, 1, 2, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047555() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 6, 7, 8});
  }
}
