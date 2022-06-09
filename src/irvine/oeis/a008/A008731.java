package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008731 Molien series for 3-dimensional group [2, n] = *22n.
 * @author Sean A. Irvine
 */
public class A008731 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008731() {
    super(new long[] {1}, new int[] {2, 2, 3});
  }
}

