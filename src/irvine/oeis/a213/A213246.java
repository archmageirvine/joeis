package irvine.oeis.a213;
// manually verified, 2023-04-29

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213246 Number of nonzero elements in GF(2^n) that are 9th powers.
 * @author Sean A. Irvine
 */
public class A213246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213246() {
    super(1, new long[] {-64, 0, 0, 0, 0, 0, 65, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 5, 31, 7, 127, 85, 511, 341, 2047, 455});
  }
}
