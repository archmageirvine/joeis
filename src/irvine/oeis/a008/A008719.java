package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008719 Expansion of <code>1/((1-x)(1-x^4 )(1-x^6 )(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A008719 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008719() {
    super(new long[] {1}, new int[] {1, 4, 6, 12});
  }
}

