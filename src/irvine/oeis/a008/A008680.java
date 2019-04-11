package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008680 Expansion of <code>1/((1-x^3)(1-x^4)(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A008680 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008680() {
    super(new long[] {1}, new int[] {3, 4, 5});
  }
}

