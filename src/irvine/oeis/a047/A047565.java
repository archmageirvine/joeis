package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047565 Numbers that are congruent to <code>{0, 1, 3, 4, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047565() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 5, 6, 7, 8});
  }
}
