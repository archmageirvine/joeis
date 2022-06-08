package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008799 Molien series for group [2,6]+ = 226.
 * @author Sean A. Irvine
 */
public class A008799 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008799() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 6});
  }
}

