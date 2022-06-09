package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008260 Coordination sequence for Paracelsian.
 * @author Sean A. Irvine
 */
public class A008260 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008260() {
    super(
      new long[] {1, 2, 3, 5, 5, 3, 2, 1},
      new int[] {1, 1, 5});
  }
}

