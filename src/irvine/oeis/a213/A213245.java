package irvine.oeis.a213;
// manually verified, 2023-04-29

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213245 Number of nonzero elements in GF(2^n) that are 7th powers.
 * @author Sean A. Irvine
 */
public class A213245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213245() {
    super(1, new long[] {-8, 0, 0, 9, 0, 0}, new long[] {1, 3, 1, 15, 31, 9});
  }
}
