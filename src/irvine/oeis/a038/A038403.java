package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038403 Coordination sequence <code>T1</code> for Zeolite Code AFN.
 * @author Sean A. Irvine
 */
public class A038403 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038403() {
    super(
      new long[] {1, 4, 9, 19, 33, 51, 74, 90, 104, 120, 127, 119, 94, 73, 43, 0, -37, -73, -95, -119, -130, -120, -109, -90, -75, -51, -30, -19, -8, -4, 1, 0, -2},
      new int[] {6, 6, 8, 10});
  }
}
