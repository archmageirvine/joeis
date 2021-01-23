package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008645 Molien series of 6 X 6 upper triangular matrices over GF( 2 ).
 * @author Sean A. Irvine
 */
public class A008645 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008645() {
    super(new long[] {1}, new int[] {1, 2, 4, 8, 16, 32});
  }
}

