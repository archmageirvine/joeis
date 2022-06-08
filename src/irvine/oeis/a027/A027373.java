package irvine.oeis.a027;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A027373 Coordination sequence T1 for Zeolite Code SAT.
 * @author Sean A. Irvine
 */
public class A027373 extends CoordinationSequence {

  /** Construct the sequence. */
  public A027373() {
    super(
      new long[] {1, 4, 10, 20, 33, 50, 71, 95, 123, 153, 182, 205, 219, 226, 226, 219, 205, 182, 153, 123, 95, 71, 50, 33, 20, 10, 4, 1},
      new int[] {8, 9, 10});
  }
}
