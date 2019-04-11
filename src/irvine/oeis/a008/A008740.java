package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008740 Molien series for 3-dimensional group <code>[2+,n] = 2*(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A008740 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008740() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {1, 1, 9});
  }
}

