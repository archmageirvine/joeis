package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008652 Molien series for group of 3 X 3 upper triangular matrices over GF( 4 ).
 * @author Sean A. Irvine
 */
public class A008652 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008652() {
    super(new long[] {1}, new int[] {1, 4, 16});
  }
}

