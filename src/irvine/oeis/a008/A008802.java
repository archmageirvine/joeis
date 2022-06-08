package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008802 Molien series for group [2,9]+ = 229.
 * @author Sean A. Irvine
 */
public class A008802 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008802() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 9});
  }
}

