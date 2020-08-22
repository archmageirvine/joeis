package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008736 Molien series for 3-dimensional group [2+,n] = 2*(n/2).
 * @author Sean A. Irvine
 */
public class A008736 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008736() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 16});
  }
}

