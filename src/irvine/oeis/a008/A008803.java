package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008803 Molien series for group <code>[2,10]+ = 2 2 10</code>.
 * @author Sean A. Irvine
 */
public class A008803 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008803() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 10});
  }
}

