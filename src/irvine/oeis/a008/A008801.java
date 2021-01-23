package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008801 Molien series for group [2,8]+ = 228.
 * @author Sean A. Irvine
 */
public class A008801 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008801() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 8});
  }
}

