package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115929 Numbers k such that k and 4*k, taken together, are zeroless pandigital, that is, use all the digits 1-9 exactly once.
 * @author Georg Fischer
 */
public class A115929 extends FiniteSequence {

  /** Construct the sequence. */
  public A115929() {
    super(1, FINITE, 3942, 4392, 5796, 7956);
  }
}
