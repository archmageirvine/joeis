package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008814 Expansion of (1+x^7)/(1-x)^2/(1-x^7).
 * @author Sean A. Irvine
 */
public class A008814 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008814() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 1, 7});
  }
}

