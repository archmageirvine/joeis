package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008743 Molien series for 3-dimensional group [3,4]+ = 432.
 * @author Sean A. Irvine
 */
public class A008743 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008743() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 4, 6});
  }
}

