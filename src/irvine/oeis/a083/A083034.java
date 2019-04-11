package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083034 Numbers that are congruent to <code>{0, 1, 3, 5, 7, 8, 10} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A083034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083034() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 8, 10, 12});
  }
}
