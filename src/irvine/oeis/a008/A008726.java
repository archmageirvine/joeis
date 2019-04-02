package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008726 Molien series 1/((1-x)^2*(1-x^8)) for 3-dimensional group [2,n] = *22n.
 * @author Sean A. Irvine
 */
public class A008726 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008726() {
    super(new long[] {1}, new int[] {1, 1, 8});
  }
}

