package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190785 Numbers that are congruent to <code>{0, 2, 3, 5, 7, 9, 11} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A190785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190785() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 9, 11, 12});
  }
}
