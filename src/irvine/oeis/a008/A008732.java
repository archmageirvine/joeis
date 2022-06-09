package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008732 Molien series for 3-dimensional group [2,n] = *22n.
 * @author Sean A. Irvine
 */
public class A008732 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008732() {
    super(new long[] {1}, new int[] {1, 1, 5});
  }
}

