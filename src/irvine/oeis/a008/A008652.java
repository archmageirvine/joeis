package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008652 Molien series for group of <code>3 X 3</code> upper triangular matrices over <code>GF( 4 )</code>.
 * @author Sean A. Irvine
 */
public class A008652 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008652() {
    super(new long[] {1}, new int[] {1, 4, 16});
  }
}

