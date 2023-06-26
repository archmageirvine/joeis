package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117565 Numbers n such that n is 7*(the sum of decimal digits squared of n).
 * @author Georg Fischer
 */
public class A117565 extends FiniteSequence {

  /** Construct the sequence. */
  public A117565() {
    super(1, FINITE, 0, 133, 917, 973);
  }
}
