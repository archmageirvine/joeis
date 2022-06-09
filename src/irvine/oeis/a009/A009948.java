package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009948 Coordination sequence for alpha-Nd, Position Nd1.
 * @author Sean A. Irvine
 */
public class A009948 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009948() {
    super(
      new long[] {1, 10, 19, 24, 19, 10, 1},
      new int[] {1, 1, 4});
  }
}
