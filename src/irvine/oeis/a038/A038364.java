package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038364 Numbers n such that n = (product of digits of n) + (sum of digits of n).
 * @author Georg Fischer
 */
public class A038364 extends FiniteSequence {

  /** Construct the sequence. */
  public A038364() {
    super(0, 19, 29, 39, 49, 59, 69, 79, 89, 99);
  }
}
