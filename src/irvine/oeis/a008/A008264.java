package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008264 Coordination sequence for tridymite, lonsdaleite, and wurtzite.
 * @author Sean A. Irvine
 */
public class A008264 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008264() {
    super(
      new long[] {1, 2, 5, 5, 5, 2, 1},
      new int[] {1, 1, 4});
  }
}

