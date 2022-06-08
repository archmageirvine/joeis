package irvine.oeis.a038;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A038408 Coordination sequence for Zeolite Code DFT.
 * @author Sean A. Irvine
 */
public class A038408 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038408() {
    super(
      new long[] {1, 3, 6, 10, 12, 12, 10, 6, 3, 1},
      new int[] {1, 3, 5});
  }
}
