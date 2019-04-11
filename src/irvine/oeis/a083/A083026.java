package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083026 Numbers that are congruent to <code>{0, 2, 4, 5, 7, 9, 11} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A083026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083026() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 4, 5, 7, 9, 11, 12});
  }
}
