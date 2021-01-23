package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008739 Molien series for 3-dimensional group [2+,n] = 2*(n/2).
 * @author Sean A. Irvine
 */
public class A008739 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008739() {
    super(new long[] {1, 0, 0, 0, 1}, new int[] {1, 1, 7});
  }
}

