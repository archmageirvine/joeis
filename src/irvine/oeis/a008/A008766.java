package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008766 Expansion of (1+x^5)/((1-x)*(1-x^2)*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A008766 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008766() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {1, 2, 3, 4});
  }
}

