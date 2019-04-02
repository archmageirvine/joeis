package irvine.oeis.a057;

import irvine.oeis.CoordinationSequence;

/**
 * A057315 Coordination sequence T2 for Zeolite Code SAV.
 * @author Sean A. Irvine
 */
public class A057315 extends CoordinationSequence {

  /** Construct the sequence. */
  public A057315() {
    super(
      new long[] {1, 3, 5, 7, 9, 11, 12, 11, 10, 10, 10, 11, 12, 11, 9, 7, 5, 3, 1},
      new int[] {1, 3, 14});
  }
}
