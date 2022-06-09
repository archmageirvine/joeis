package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008082 Coordination sequence T1 for Zeolite Code EAB.
 * @author Sean A. Irvine
 */
public class A008082 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008082() {
    super(
      new long[] {1, 4, 9, 17, 30, 48, 67, 82, 94, 108, 124, 137, 142, 137, 124, 108, 94, 82, 67, 48, 30, 17, 9, 4, 1},
      new int[] {5, 7, 12});
  }
}

