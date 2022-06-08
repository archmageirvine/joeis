package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008730 Molien series 1/((1-x)^2*(1-x^12)) for 3-dimensional group [2,n] = *22n.
 * @author Sean A. Irvine
 */
public class A008730 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008730() {
    super(new long[] {1}, new int[] {1, 1, 12});
  }
}

