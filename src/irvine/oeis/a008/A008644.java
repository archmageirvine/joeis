package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008644 Molien series of 5 X 5 upper triangular matrices over GF( 2 ).
 * @author Sean A. Irvine
 */
public class A008644 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008644() {
    super(new long[] {1}, new int[] {1, 2, 4, 8, 16});
  }
}

