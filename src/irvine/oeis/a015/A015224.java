package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015224 Even pentagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A015224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015224() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {0, 6, 18, 40, 126, 196, 288, 550, 726, 936});
  }
}
