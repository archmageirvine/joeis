package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008727 Molien series for 3-dimensional group [2,n] = *22n.
 * @author Sean A. Irvine
 */
public class A008727 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008727() {
    super(new long[] {1}, new int[] {1, 1, 9});
  }
}

