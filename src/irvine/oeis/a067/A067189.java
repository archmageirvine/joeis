package irvine.oeis.a067;

import irvine.oeis.FiniteSequence;

/**
 * A067189 Numbers that can be expressed as the sum of two primes in exactly three ways.
 * @author Georg Fischer
 */
public class A067189 extends FiniteSequence {

  /** Construct the sequence. */
  public A067189() {
    super(1, FINITE, 22, 24, 26, 30, 40, 44, 52, 56, 62, 98, 128);
  }
}
