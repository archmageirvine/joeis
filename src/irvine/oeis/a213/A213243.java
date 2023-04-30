package irvine.oeis.a213;
// manually verified, 2023-04-29

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213243 Number of nonzero elements in GF(2^n) that are cubes.
 * @author Sean A. Irvine
 */
public class A213243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213243() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 7, 5});
  }
}
