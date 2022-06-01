package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213039 n^3-[n/3]^3, where [] = floor.
 * @author Sean A. Irvine
 */
public class A213039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213039() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {0, 1, 8, 26, 63, 124, 208, 335, 504, 702});
  }
}
