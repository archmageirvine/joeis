package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008120 Coordination sequence <code>T5</code> for Zeolite Code HEU.
 * @author Sean A. Irvine
 */
public class A008120 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008120() {
    super(
      new long[] {1, 4, 12, 18, 33, 57, 71, 75, 64, 71, 56, -2, -53, -81, -91, -130, -168, -152, -105, -79, -61, -22, 44, 79, 76, 77, 77, 69, 35, 18, 10, 0, -3, -4, 0, 2, 0, 0, 2},
      new int[] {4, 5, 6, 7, 10});
  }
}
