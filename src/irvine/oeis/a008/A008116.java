package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008116 Coordination sequence <code>T1</code> for Zeolite Code HEU.
 * @author Sean A. Irvine
 */
public class A008116 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008116() {
    super(
      new long[] {1, 4, 10, 20, 33, 57, 70, 69, 80, 76, 44, 1, -47, -79, -106, -146, -165, -143, -105, -83, -58, -12, 38, 74, 80, 81, 87, 67, 38, 14, 4, 1, -8, -3, 2, 0, 2, 1, 0, 1},
      new int[] {4, 5, 6, 7, 10});
  }
}
