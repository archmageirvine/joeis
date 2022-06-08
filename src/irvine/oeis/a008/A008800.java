package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008800 Molien series for group [2,7]+ = 227.
 * @author Sean A. Irvine
 */
public class A008800 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008800() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 7});
  }
}

