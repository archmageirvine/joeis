package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008751 Expansion of (1+x^8)/((1-x)*(1-x^2)*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A008751 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008751() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

