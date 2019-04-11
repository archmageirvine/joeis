package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008730 Molien series <code>1/((1-x)^2*(1-x^12))</code> for 3-dimensional group <code>[2,n] = *22n</code>.
 * @author Sean A. Irvine
 */
public class A008730 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008730() {
    super(new long[] {1}, new int[] {1, 1, 12});
  }
}

