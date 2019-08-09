package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008748 Expansion of <code>(1 + x^5) / ((1-x) * (1-x^2) * (1-x^3))</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A008748 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008748() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

