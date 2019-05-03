package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008223 Coordination sequence <code>T5</code> for Zeolite Code PAU.
 * @author Sean A. Irvine
 */
public class A008223 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008223() {
    super(
      new long[] {1, 3, 5, 9, 13, 16, 21, 23, 24, 28, 27, 25, 27, 25, 26, 30, 26, 25, 27, 25, 27, 28, 24, 23, 21, 16, 13, 9, 5, 3, 1},
      new int[] {1, 7, 22});
  }
}
