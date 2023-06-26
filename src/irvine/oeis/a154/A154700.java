package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154700 Prime divisors of 2^36-1.
 * @author Georg Fischer
 */
public class A154700 extends FiniteSequence {

  /** Construct the sequence. */
  public A154700() {
    super(1, FINITE, 3, 5, 7, 13, 19, 37, 73, 109);
  }
}
