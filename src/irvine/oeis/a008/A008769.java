package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008769 Expansion of (1+x^8)/((1-x)*(1-x^2)*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A008769 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008769() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3, 4});
  }
}

