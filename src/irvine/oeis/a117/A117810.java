package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117810 Numbers n such that n is k*(the sum of decimal digits squared of n), k=153 case.
 * @author Georg Fischer
 */
public class A117810 extends FiniteSequence {

  /** Construct the sequence. */
  public A117810() {
    super(1, FINITE, 0, 4131, 12546, 14382, 16218, 16830, 26469);
  }
}
