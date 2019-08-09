package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008755 Expansion of <code>(1+x^12)/((1-x)*(1-x^2)*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A008755 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008755() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

