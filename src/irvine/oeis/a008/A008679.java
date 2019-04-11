package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008679 Expansion of <code>1/((1-x^3)(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A008679 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008679() {
    super(new long[] {1}, new int[] {3, 4});
  }
}

