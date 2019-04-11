package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008815 Expansion of <code>(1+x^8)/(1-x)^2/(1-x^8)</code>.
 * @author Sean A. Irvine
 */
public class A008815 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008815() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 1, 8});
  }
}

