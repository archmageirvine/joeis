package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073396 The number n equals the product of two numbers: sums of prime factors of n, with and without repetition.
 * @author Georg Fischer
 */
public class A073396 extends FiniteSequence {

  /** Construct the sequence. */
  public A073396() {
    super(1, FINITE, 16, 27, 150);
  }
}
