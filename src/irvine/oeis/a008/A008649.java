package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008649 Molien series of <code>3 X 3</code> upper triangular matrices over <code>GF( 3 )</code>.
 * @author Sean A. Irvine
 */
public class A008649 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008649() {
    super(new long[] {1}, new int[] {1, 3, 9});
  }
}

